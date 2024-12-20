package com.nit.generator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;
//@Component                                                // no need to mention any annotation
public class OrderIdGenerator implements IdentifierGenerator
{

	 @Override
	    public Object generate(SharedSessionContractImplementor session, Object object) {
	        String prefix = "OD";
	        String suffix = "";

	        try {
	            // Obtain the connection
	            JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
	            Connection con = jdbcConnectionAccess.obtainConnection();

	            Statement stm = con.createStatement();
	            String sql = "SELECT order_id_seq.nextval FROM dual";  // Assuming Oracle
	            ResultSet rs = stm.executeQuery(sql);

	            if (rs.next()) {
	                int seqval = rs.getInt(1);
	                suffix = String.valueOf(seqval);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return prefix + suffix;
	    }
	}

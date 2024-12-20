package com.nit.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsEntity {

	@SuppressWarnings("deprecation")
	@Id
	@GenericGenerator(name="order_id_gen",strategy = "com.nit.generator.OrderIdGenerator")
	@GeneratedValue(generator = "order_id_gen")
	@Column(length = 30)
	private String orderId;
	
	@Column(length = 30)
	private String orderBy;
	
	@Column
	private Date orderPlacedDate;
}

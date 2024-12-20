package com.nit;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.entity.OrderDetailsEntity;
import com.nit.repo.OrderDetailsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		OrderDetailsRepo bean = run.getBean(OrderDetailsRepo.class);
		OrderDetailsEntity entity = new OrderDetailsEntity();
		entity.setOrderBy("Giri");
		entity.setOrderPlacedDate(new Date());
	//	entity.setOrderId(null);
		OrderDetailsEntity save = bean.save(entity);
		System.out.println(save);
		
		run.close();
	}

}

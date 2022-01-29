package com.training.springboot.configuratoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.training.springboot.model.Employee;






@Component
public class BeanConfiguration {

	@Autowired
	private Employee employee ;
	
	@Scheduled(fixedDelay = 3000)
	public void employeeProvider() {
		
		System.out.println("==================================================");
		System.out.println("*************"+ employee.toString() +"************");
		System.out.println("==================================================");
		
	}
}

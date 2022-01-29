package com.training.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "emp.config")
@Component("employee")
public class Employee {

	
	private String empName ;
	
	private String designation ;
	
	private Integer experience;
	
	
}

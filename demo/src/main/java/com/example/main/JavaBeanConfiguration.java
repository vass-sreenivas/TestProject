package com.example.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.beans.Employee;

@Configuration
public class JavaBeanConfiguration {
	
	
	@Bean(name = {"emp1","emp2"})
	@Scope(scopeName = "prototype")
	public Employee getEmployee() {
		
		return new Employee();
	}

}

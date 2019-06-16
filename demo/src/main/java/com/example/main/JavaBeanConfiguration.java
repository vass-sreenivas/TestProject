package com.example.main;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.beans.Address;
import com.example.beans.Employee;

@Configuration
public class JavaBeanConfiguration {
	
	
	@Bean(name = {"emp1","emp2"},autowire = Autowire.BY_NAME)
	@Scope(scopeName = "singleton")
	public Employee getEmployee() {
		
		return new Employee();
	}
	
	@Bean(name= {"address"},initMethod = "initMethod",destroyMethod = "destroyMethod")
	public Address getAddress() {
		return new Address();
	}

}

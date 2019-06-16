package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.beans.Employee;

@SpringBootApplication
@ComponentScan("com.example.*")
@Import({SpringSecurityConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		//ApplicationContext context=new AnnotationConfigApplicationContext(DemoApplication.class);
		
	
		
		Employee e1=(Employee)context.getBean("emp1");
		System.out.println(e1.getFirstName());
		
		Employee e2=(Employee)context.getBean("emp2");
		System.out.println(e2.getFirstName());
		
		
		
	}

}

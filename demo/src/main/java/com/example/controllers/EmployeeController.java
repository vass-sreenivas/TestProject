package com.example.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;

@RestController
public class EmployeeController{
	
	
	List<Employee> employees=new ArrayList<Employee>();
	
	public EmployeeController() {
		employees.add(new Employee(1,"Sreenivas", "Guttula","PayPal", "30.0 Lac"));
		employees.add(new Employee(2,"Navya", "Kumar","Cigitrix", "26.0 Lac"));
		
	}
	
	@RequestMapping(method = {RequestMethod.GET},value="/hello")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping(method = {RequestMethod.GET},value="/emp/list")
	public Map<?,?> employees(){
		
		System.out.println("Employees Method is called /emp/list");
		Map<String,List<Employee>> map=new HashMap<String, List<Employee>>();
		map.put("employees", employees);
		return map;
	}
	
	@RequestMapping(method = {RequestMethod.GET},value="/emp/{id}")
	public Employee employee(@PathVariable int id) {
		
		System.out.println("Employee Method is called /emp/{id}");
		return employees.stream().filter(emp->emp.getId()==id).findFirst().orElse(null);
		
	}
	
	@RequestMapping(method= {RequestMethod.POST},value="/emp")
	public String insertEmployee(@RequestBody Employee emp) {
		
		System.out.println("insert employee is called");
		employees.add(emp);
		return emp.getFirstName()+" Employee inserted successfully";
	}
	
	@RequestMapping(method= {RequestMethod.PUT},value="/emp")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		System.out.println("update Employee is called");
		employees.stream().filter(emp->emp.getId()==employee.getId())
		                  .forEach(emp->{
		                	  if(employee.getCompanyName()!=null)
		                		  emp.setCompanyName(employee.getCompanyName());
		                	  if(employee.getCTC()!=null)
		                		  emp.setCTC(employee.getCTC());
		                	  if(employee.getFirstName()!=null)
		                		  emp.setFirstName(employee.getFirstName());
		                	  if(employee.getLastName()!=null)
		                		  emp.setLastName(employee.getLastName());
		                  });
		return employees.stream().filter(emp->emp.getId()==employee.getId()).findFirst().get();
	}
	
	@RequestMapping(method = {RequestMethod.DELETE},value="/emp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		Employee employee=employees.stream().filter(emp->emp.getId()==id).findFirst().get();
		employees.removeIf(emp->emp.getId()==id);
		return employee.getFirstName()+" Employee Deleted Successfully";
	}
	
}






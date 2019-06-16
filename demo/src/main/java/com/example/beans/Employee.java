package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	
	public Employee() {
		System.out.println("Employee Bean is Created");
	}
	
	@Value("1")
	private int id;

	@Value("Sreenivas")
	private String firstName;
	
	@Value("Guttula")
	private String lastName;
	
	@Value("SMSCountry")
	private String companyName;
	
	private String CTC;
	
	private Address address;
	


	public Employee(int id, String firstName, String lastName, String companyName, String CTC) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.CTC = CTC;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCTC() {
		return CTC;
	}


	public void setCTC(String cTC) {
		this.CTC = cTC;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

}

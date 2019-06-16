package com.example.beans;




public class Employee {
	
	
	public Employee() {
		System.out.println("Employee Bean is Created");
	}
	
	
	private int id;

	private String firstName;
	
	private String lastName;
	
	private String companyName;
	
	private String CTC;
	

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

		
	

}

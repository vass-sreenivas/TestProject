package com.example.beans;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("Hyderabad")
	private String city;
	
	@Value("Telangana")
	private String state;
	
	@Value("India")
	private String country;
	
	
	public Address() {
		System.out.println("Address Bean Created");
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void initMethod() {
		System.out.println("Init Method is called");
	}

	public void destroyMethod() {
		System.out.println("Destroy Method is called");
	}
	
}

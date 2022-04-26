package com.spring.core.springcoreadvanced.autowire;

public class Adrs {
	private int hno;
	private String city;
	private String street;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Adrs [hno=" + hno + ", city=" + city + ", street=" + street + "]";
	}
	
}

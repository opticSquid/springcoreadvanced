package com.spring.core.springcoreadvanced.autowire;

public class Employee {
	private Adrs address;

	public Adrs getAddress() {
		return address;
	}

	public void setAddress(Adrs address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [getAddress()=" + getAddress() + "]";
	}

}

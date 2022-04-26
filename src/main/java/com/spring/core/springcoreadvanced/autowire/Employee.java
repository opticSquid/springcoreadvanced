package com.spring.core.springcoreadvanced.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Adrs address;

	Employee(Adrs address) {
		this.address = address;
	}

	public Adrs getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Adrs Address) {
		this.address = Address;
	}

	@Override
	public String toString() {
		return "Employee [getAddress()=" + getAddress() + "]";
	}

}

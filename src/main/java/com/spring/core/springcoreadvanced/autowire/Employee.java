package com.spring.core.springcoreadvanced.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private Adrs address;

	Employee(Adrs address) {
		this.address = address;
	}

	public Adrs getAddress() {
		return address;
	}

	// required = false is put here because if no matching bean definition is found
	// then java should not raise an exception in that case and give null value to the variable
	// other wise it would raise an exception and code execution will stop
	@Autowired(required = false)
	@Qualifier("address2")
	public void setAddress(Adrs Address) {
		this.address = Address;
	}

	@Override
	public String toString() {
		return "Employee [getAddress()=" + getAddress() + "]";
	}

}

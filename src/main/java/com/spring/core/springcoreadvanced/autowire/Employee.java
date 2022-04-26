package com.spring.core.springcoreadvanced.autowire;

public class Employee {
	// while auto wiring by name the dependency variable name must match the bean
	// name in this case it is address so in config file there has to be a bean
	// named "address"
	/*
	 * To be Noted In this ByName auto-wiring the bean name should be in small case
	 * and hence the variable name should also be in small case
	 */
	private Adrs address;

	Employee(Adrs address) {
		this.address = address;
	}

	public Adrs getAddress() {
		return address;
	}

	public void setAddress(Adrs Address) {
		this.address = Address;
	}

	@Override
	public String toString() {
		return "Employee [getAddress()=" + getAddress() + "]";
	}

}

package com.spring.core.springcoreadvanced.stereotype.annotations;

import org.springframework.stereotype.Component;

// the name that we pass on to the @component in this case it is "inst" 
//overides the default bean name and the new bean is named "inst"
@Component("inst")
public class Instructor {
	int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [getId()=" + getId() + ", getName()=" + getName() + "]";
	}

}

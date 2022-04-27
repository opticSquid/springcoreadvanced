package com.spring.core.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// the name that we pass on to the @component in this case it is "inst" 
//overrides the default bean name and the new bean is named "inst"
@Component("inst")
@Scope("prototype")
public class Instructor {
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;
	// Here we are using java string methods in expression language
	// do not forge to enclose the string with single quotes
	@Value("#{'sb'.toUpperCase()}")
	private String name;
	@Value("#{topics}")
	private List<String> topics;
	@Autowired
	private Profile profile;
	// Different variations of using passing a boolean value to the @Value
	// annotation
	
//Simple true or false
	//	@Value("true")
//If the evaluated value is true the value of variable is true or it is false	
	//	@Value("#{2+4>5}")
// Simple ternary operator, you are familiar with it from js
	@Value("#{2+4>8?true:false}")
	private boolean active;

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

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}

}

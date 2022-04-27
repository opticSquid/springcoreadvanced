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
	// This is a way to access a static variable in @Value annotation
	// java.lang.Integer.MIN_VALUE is a constant static variable
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;
	@Value("sb")
	private String name;
	@Value("#{topics}")
	private List<String> topics;
	@Autowired
	private Profile profile;

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

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

}

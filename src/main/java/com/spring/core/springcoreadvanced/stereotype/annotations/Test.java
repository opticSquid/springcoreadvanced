package com.spring.core.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/spring/core/springcoreadvanced/stereotype/annotations/config.xml");
		// Spring will by default create the bean with the camel case format where
		// "Instructor" class name becomes "instructor" bean name
		Instructor instructor = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor);
	}
}

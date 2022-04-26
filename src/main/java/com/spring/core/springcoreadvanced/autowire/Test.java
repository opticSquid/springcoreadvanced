package com.spring.core.springcoreadvanced.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/spring/core/springcoreadvanced/autowire/config.xml");
		Employee emple = (Employee) ctx.getBean("Employee");
		System.out.println(emple);
	}
}

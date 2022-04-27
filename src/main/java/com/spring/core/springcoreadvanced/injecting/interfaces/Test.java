package com.spring.core.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("com/spring/core/springcoreadvanced/injecting/interfaces/config.xml");
		OrderBO bo = (OrderBO) ctx.getBean("bo");
		bo.placeOrder();
	}
}

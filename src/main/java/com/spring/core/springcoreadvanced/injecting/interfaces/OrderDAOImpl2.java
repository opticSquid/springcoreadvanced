package com.spring.core.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside OrderDAO 2");
	}

}

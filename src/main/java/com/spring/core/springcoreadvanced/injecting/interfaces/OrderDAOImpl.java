package com.spring.core.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside create order");
	}

}

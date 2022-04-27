package com.spring.core.springcoreadvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;
	@Override
	public void placeOrder() {
		System.out.println("Inside order BO");
		dao.createOrder();
	}
	public OrderDAO getDao() {
		return dao;
	}
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}

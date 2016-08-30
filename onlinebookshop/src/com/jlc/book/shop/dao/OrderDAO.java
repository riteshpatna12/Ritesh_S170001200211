package com.jlc.book.shop.dao;

import java.util.List;

import com.jlc.book.shop.to.OrderTo;



public interface OrderDAO {

	public String placeOrder(OrderTo oto, String ip);
	public List getOrderByUserId(String userId);
	public List getAllOrderInfo();
	public void UpdateStatus(String orderId,String status);
	public OrderTo getOrderByOrderId(String orderId);
	
	
}

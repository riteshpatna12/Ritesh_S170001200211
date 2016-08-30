package com.jlc.book.shop.delegate;

import java.util.List;

import com.jlc.book.shop.dao.OrderDAO;
import com.jlc.book.shop.factory.DAOFactory;
import com.jlc.book.shop.to.OrderTo;

public class OrderDelegate {

	private static OrderDAO orderDAO;
	static{
			orderDAO= DAOFactory.getOrderDAO();
	}
	
	public String placeOrder(OrderTo oto, String ip){
	return orderDAO.placeOrder(oto,ip);
	}
	
	public List getOrderByUserId(String userId){
		return orderDAO.getOrderByUserId(userId);
	}
	
	public List getAllOrderInfo(){
		return orderDAO.getAllOrderInfo();
	}
	
	public void UpdateStatus(String orderId,String status){
		orderDAO.UpdateStatus(orderId, status);
	}
	
	public OrderTo getOrderByOrderId(String orderId){
		return orderDAO.getOrderByOrderId(orderId);
	}
	
	
}

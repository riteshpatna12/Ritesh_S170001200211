package com.jlc.book.shop.dao;

import java.util.List;

import com.jlc.book.shop.to.OrderTo;

public class JDBCOrderDAO implements OrderDAO {

	@Override
	public String placeOrder(OrderTo oto, String ip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getOrderByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllOrderInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getUpdateStatus(String orderId, String status) {
		// TODO Auto-generated method stub

	}

	@Override
	public OrderTo getOrderByOrderId(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.vizron.spring.dao;

	import java.util.List;

import org.springframework.stereotype.Repository;


import com.vizron.bookstore.model.Order;


	@Repository
	public interface OrderDAO {
	
	public boolean save(Order order);
	
	public boolean update(Order order);
	
	public boolean delete(Order order);
	
	public Order get(String orderId);
	
	public List<Order> listOrders();

}

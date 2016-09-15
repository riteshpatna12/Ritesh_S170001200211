package com.vizron.bookstore.dao;

import java.util.List;

import com.vizron.bookstore.model.Cart;

public interface CartDAO {
	
	public List<Cart> list();
	public Cart get(String id);
	public void saveOrUpdate(Cart cart);
	public String delete(String id);
	public int getTotalAmount(String id);
	

}

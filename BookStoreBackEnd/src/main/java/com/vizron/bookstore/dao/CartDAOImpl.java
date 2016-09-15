package com.vizron.bookstore.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vizron.bookstore.model.Cart;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {

	@Override
	public List<Cart> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Cart cart) {
		// TODO Auto-generated method stub

	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalAmount(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}

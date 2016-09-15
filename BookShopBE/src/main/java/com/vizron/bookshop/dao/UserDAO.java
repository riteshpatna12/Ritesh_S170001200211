package com.vizron.bookshop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vizron.bookshop.model.User;

@Repository // database repository
public interface UserDAO {
	
	//declare all crud operation
	
	public boolean save(User user);
	public boolean update(User user);
	public boolean delete(User user);
	public User get(String id);
	public User isValidUser(String id, String password);
	public List<User> list();
	
}
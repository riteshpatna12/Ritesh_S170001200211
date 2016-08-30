package com.vizron.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vizron.bookstore.model.Category;
import com.vizron.bookstore.model.User;

@Repository
public interface UserDAO {
	
	//Declare all curd operation
		public boolean save(User user);
		
		public boolean update(User user);
		
		public boolean delete(User user);
		
		public User getUserById(String emailId);
		
		public List<User> listUsers();
		
	
	

}

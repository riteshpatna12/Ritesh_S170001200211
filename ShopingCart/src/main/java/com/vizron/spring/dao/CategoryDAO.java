package com.vizron.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vizron.bookstore.model.Category;

@Repository
public interface CategoryDAO {
	
	//Declare all curd operation
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(Category category);
	
	public Category getCategoryById(String categoryId);
	
	public List<Category> listCategory();
	
		
	
	
	
}

package com.vizron.bookshop;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookshop.dao.CategoryDAO;
import com.vizron.bookshop.model.Category;


public class TestCaseCategory {

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Category category;

	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
	
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		category=(Category) context.getBean("category");
	}
	//@Test
	public void categoryListTestCase()
	{
			List <Category> list=categoryDAO.list();
			int rowCount=list.size();
			assertEquals("Category List Count "  ,rowCount, 1);
	}
	
	//@Test
	public void addCategoryTestCase()
	{
		category.setId("00001");
		category.setName("CGName 0022");
		category.setDescription("Category 0022");
			
		assertEquals("addCategoryTestCase() ...", categoryDAO.save(category),true);
	}
	
	//@Test
	public void deleteCategoryTestCase()
	{
		category.setId("00001");
		boolean flag=categoryDAO.delete(category);
			
		assertEquals(" deletecategorytCase()", flag,true);
	}
	//@Test
	public void updateCategoryTestCase()
	{
		category.setId("00002");
		category.setName("CGName-2");
		category.setDescription("Category two");
		
		assertEquals("updateCategoryTestCase() ...", categoryDAO.update(category),true);
	}
	//@Test
	public void getCategoryTestCase()
	{
		assertEquals("getCategoryTestCase()..",categoryDAO.get("00002"),null);
	}
	
}


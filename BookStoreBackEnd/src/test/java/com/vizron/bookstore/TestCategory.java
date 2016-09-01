package com.vizron.bookstore;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.model.Category;

public class TestCategory {
	
	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	Category category;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	 	public void init(){
		context= new AnnotationConfigApplicationContext();
		context.scan("com.vizron");
		
		
		
		categoryDAO =(CategoryDAO)context.getBean("categoryDAO");
		category=(Category)context.getBean("category");
	}
	
	
		/*@Test
		public void categoryListTestCase(){
			List<Category> list= categoryDAO.list();
			int rowCount=list.size();
				assertEquals("Category list test case",rowCount,8);
			
		}*/
		
		/*@Test
		public void getCategoryTestCase(){
			
			category=categoryDAO.get("CT-201");
			assertEquals(category.getCategoryName(),true);
		}
		*/
		@Test
		public void addCategoryTestCase(){
			
			category.setCategoryId("CT-209");
			category.setCategoryName("Database management system");
			category.setDescription("Related to Tables");
			
			boolean flag=categoryDAO.save(category);
			assertEquals(flag,true);
		}
		
		/*@Test
		public void deleteCategoryTestCase(){
			category.setCategoryId("BK001");
			boolean flag =categoryDAO.delete(category);
			assertEquals("deleteCategoryTestCase",flag,false);
			
		}*/
		
	

	

}

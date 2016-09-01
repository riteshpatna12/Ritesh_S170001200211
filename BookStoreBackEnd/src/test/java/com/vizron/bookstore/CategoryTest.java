package com.vizron.bookstore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.model.Category;

public class CategoryTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
			context.scan("com.vizron.bookstore");
			context.refresh();
			
			
			
			CategoryDAO categoryDAO= (CategoryDAO)context.getBean("categoryDAO");
			Category category=(Category)context.getBean("category");
			
				category.setCategoryId("CT-1001");
				category.setCategoryName("Programming");
				category.setDescription("Computer Book");
				
				if(categoryDAO.save(category)==true){
					
					System.out.println("created successfully ");
				}else {
					
					System.out.println("not created");
				}
				
				
				
				
	}

}

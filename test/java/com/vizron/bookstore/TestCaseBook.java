package com.vizron.bookstore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookstore.dao.BookDAO;
import com.vizron.bookstore.model.Book;

public class TestCaseBook {

	//to write test case for book,we need bookDAO and book object	
		@Autowired
		BookDAO bookDAO;
		@Autowired
		Book book;

		AnnotationConfigApplicationContext context;
		//you can write a method to initialize the objects.

		@Before
			public void init(){
				context=new AnnotationConfigApplicationContext();
				context.scan("com.vizron.bookstore");
				context.refresh();

				bookDAO=(BookDAO)context.getBean("bookDAO");
				book = (Book)context.getBean("book");
	}	

			/*//DELETE CASE TEST
				@Test
					public void deleteBookTestCase(){
						book.setBookId("BK-001");
						boolean flag=bookDAO.delete(book);
						assertEquals("deleteBookCaseTest",flag,false);	
	}	*/
		
			//ADD CASE TEST
				@Test
					public void addBookTestCase(){
						book.setBookId("BK-009");
						book.setAuthorName("RaviShankar");
						book.setBookName("Core Java");
						book.setCategoryId("CT-202");
						book.setCost(540);
						book.setEdition("3th");
						book.setStock(190);
						book.setSupplierId("SP-103");
						
						assertEquals("addBookTestCase",bookDAO.save(book),true);
	}	
				
			//LIST OF BOOKS CASE TEST
				@Test
					public void listBookTestCase(){
						assertEquals("listBookTestCase",bookDAO.list().size(),2);
	}
		
				//UPDATE BOOK CASE TEST
				@Test 
					public void updateBookTestCase(){
						book.setBookId("BK-002");
						book.setAuthorName("Nagraj");
						book.setBookName("Black Book for Core JAVA");
						book.setCategoryId("CT-201");
						book.setCost(350);
						book.setEdition("3rd");
						book.setStock(250);
						book.setSupplierId("SP-103");
						assertEquals("updateBookTestCase",bookDAO.update(book),true);
	}
			//GET BOOK CASE TEST
				@Test
					public void getBookTestCase(){
						assertEquals("getBookTestCase",bookDAO.get("BK-008"),null);
	}
}
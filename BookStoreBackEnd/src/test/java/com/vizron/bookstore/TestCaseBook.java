package com.vizron.bookstore;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookstore.dao.BookDAO;
import com.vizron.bookstore.model.Book;
import com.vizron.bookstore.model.Supplier;

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
						book.setBookId("BK-010");
						boolean flag=bookDAO.delete(book);
						assertEquals("deleteBookCaseTest",flag,false);	
	}	*/
		
			//ADD CASE TEST
				/*@Test
					public void addBookTestCase(){
						book.setBookId("BK-010");
						book.setAuthorName("Amritesh Pandey");
						book.setBookName("Spring Framework");
						book.setCategoryId("CT-200");
						book.setCost(1000);
						book.setEdition("6th");
						book.setStock(200);
						book.setSupplierId("SP-102");
						
						assertEquals("addBookTestCase",bookDAO.save(book),true);
	}	*/
				
			//LIST OF BOOKS CASE TEST
				@Test
					public void listBookTestCase(){
					List<Book> list= bookDAO.list();
				//	int rowCount=list.size();
						assertEquals("listBookTestCase",bookDAO.list().size(),4);
						}
		
				//UPDATE BOOK CASE TEST
				//@Test 
					public void updateBookTestCase(){
						book.setBookId("BK-009");
						book.setAuthorName("Ashish Sinha");
						book.setBookName("Black Book for Core JAVA");
						book.setCategoryId("CT-200");
						book.setStock(250);
						book.setSupplierId("SP-101");
						assertEquals("updateBookTestCase",bookDAO.update(book),true);
	}
			//GET BOOK CASE TEST
				@Test
					public void getBookTestCase(){
						assertEquals("getBookTestCase",bookDAO.get("BK-008"),null);
	}
}
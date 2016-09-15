package com.vizron.bookshop;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookshop.dao.BookDAO;
import com.vizron.bookshop.model.Book;

public class TestCaseBook {
	@Autowired
	BookDAO bookDAO;
	
	@Autowired
	Book book;
	
	AnnotationConfigApplicationContext context;
	
	// you can write a method to initialize the objects
	
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.vizron.bookshop");
		context.refresh();
		
		bookDAO = (BookDAO) context.getBean("bookDAO");
		book = (Book) context.getBean("product");
	}
	
	//@Test
	public void deleteProductTestCase()
	{
		book.setId("P001");
		boolean flag=bookDAO.delete(book);
		
		assertEquals(" deleteBookCase()", flag,true);
	}
	//@Test
	public void bookListTestCase()
	{
			List <Book> list=bookDAO.list();
			int rowCount=list.size();
			assertEquals("Book List Count = "  ,rowCount, 1);
			//assertEquals("listBookTestCase() ...", bookDAO.list().size(),3);
	}
	//@Test
	public void addBookTestCase()
	{
		book.setId("P003");
		book.setName("Spring 3 Hibernate 4");
		book.setDescription("This book will help you to understand spring with hibernate");
		book.setPrice(900);
		book.setSupplier_id("S0002");
		book.setCategory_id("00001");
		
		//productDAO.save(product);
		
		assertEquals("addProductTestCase() ...", bookDAO.save(book),true);
	}
	//@Test
	public void updateBookTestCase()
	{
		book.setId("P002");
		book.setName("Ball Pen Two");
		book.setDescription("Parkar Pen");
		book.setPrice(120);
		assertEquals("updateProductTestCase() ...", bookDAO.update(book),true);
	}
	
	//@Test
	public void getBookTestCase()
	{
		assertEquals("getBookTestCase()..",bookDAO.get("P001"),null);
	}
	
	
}

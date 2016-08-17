package com.vizron.bookstore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookstore.dao.BookDAO;
import com.vizron.bookstore.dao.OrderDAO;
import com.vizron.bookstore.model.Book;
import com.vizron.bookstore.model.Order;

public class TestCaseOrder {

	@Autowired
	OrderDAO orderDAO;
	
	@Autowired
	Order order;
	
	AnnotationConfigApplicationContext context;
	//you can write a method to initialize the objects.

	@Before
		public void init(){
			context=new AnnotationConfigApplicationContext();
			context.scan("com.vizron.bookstore");
			context.refresh();

			orderDAO=(OrderDAO)context.getBean("orderDAO");
			order = (Order)context.getBean("order");
}	
	/*//DELETE CASE TEST
	@Test
		public void deleteOrderTestCase(){
			order.setOrderId("BK-001");
			boolean flag=orderDAO.delete(order);
			assertEquals("deleteBookCaseTest",flag,false);	
}	
*/
	 

	//ADD CASE TEST
		@Test
			public void addBookTestCase(){
				order.setOrderId("BK-003");
				
				
				assertEquals("addBookTestCase",orderDAO.save(order),true);
}	
		
	//LIST OF BOOKS CASE TEST
		@Test
			public void listBookTestCase(){
				assertEquals("listBookTestCase",orderDAO.list().size(),2);
}
		
		//UPDATE BOOK CASE TEST
		@Test 
			public void updateBookTestCase(){
				order.setOrderId("BK-002");
				
				assertEquals("updateBookTestCase",orderDAO.update(order),true);
}
	//GET BOOK CASE TEST
		@Test
			public void getOrderTestCase(){
				assertEquals("getOrderTestCase",orderDAO.get("ODR-008"),null);
}
}


package com.vizron.bookstore;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookstore.dao.UserDAO;
import com.vizron.bookstore.model.User;

public class TestCaseUser{
	
	@Autowired
	UserDAO userDAO;
	@Autowired
	User user;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	 	public void init(){
		
		context= new AnnotationConfigApplicationContext();
		context.scan("com.vizron");
		context.refresh();
		userDAO =(UserDAO)context.getBean("userDAO");
		user=(User)context.getBean("user");
	}
		@Test
		public void userListTestCase(){
			List<User> list= userDAO.list();
			int rowCount=list.size();
				assertEquals("User list test case",rowCount,5);
			
		}
		
		@Test
		public void userGetTestCase(){
			
			user=userDAO.get("Bk001");
			assertEquals(user.getFirstName(),"");
		}

		@Test
		public void addTestCase(){
			
			user.setEmailId("emailId");
			user.setFirstName("firstName");
			user.setLastName("lastName");
			user.setRole("role");
			
			boolean flag=userDAO.save(user);
			assertEquals(flag,true);
		}
	

}

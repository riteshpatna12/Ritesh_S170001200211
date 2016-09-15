package com.vizron.bookshop;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookshop.dao.UserDAO;
import com.vizron.bookshop.model.User;

public class TestCaseUser {

	
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
	}
	
	@Test
	public void addUserTestCase()
	{
		user.setId("USR-02");
		user.setName("Ravi pongat");
		user.setContact("9876543");
		user.setMail("rp@gmail.com");
		user.setPassword("5678");
		user.setAddress("Chandigarh");
		user.setRole("ROLE_ADMIN");
				
		assertEquals("addUserTestCase() ...", userDAO.save(user),true);
		
	}
	//@Test
	public void deleteUserTestCase()
	{
		user.setId("USR-02");
		boolean flag=userDAO.delete(user);
			
		assertEquals(" deleteusertCase()", flag,true);
	}
	//@Test
	public void updateUserTestCase()
	{
		user.setId("USR-01");
		user.setName("Ritesh kumar");
		user.setContact("2345678");
		user.setMail("rit@gmail.com");
		user.setPassword("9876");
		user.setAddress("Danapur cantt,Patna");
		
		
		assertEquals("updateUserTestCase() ...", userDAO.update(user),true);
	}
	
	//@Test
	public void userListTestCase()
	{
			List <User> list=userDAO.list();
			int rowCount=list.size();
			assertEquals("User List Count "  ,rowCount, 1);
	}
	
	//@Test
	public void getUserTestCase()
	{
		assertEquals("getUserTestCase()..",userDAO.get("U0001"),null);
	}
		
}


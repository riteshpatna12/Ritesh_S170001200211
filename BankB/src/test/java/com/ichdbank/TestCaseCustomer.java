package com.ichdbank;

import static org.junit.Assert.assertEquals;

import org.hibernate.annotations.SelectBeforeUpdate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ichdbank.dao.CustomerDAO;
import com.ichdbank.model.Customer;



import junit.framework.TestCase;

		public class TestCaseCustomer extends TestCase {
	
				@Autowired
				CustomerDAO customerDAO;
	
				@Autowired
				Customer customer;
				
				AnnotationConfigApplicationContext context;
				
				
			 	public void init(){
				context= new AnnotationConfigApplicationContext();
				context.scan("com.vizron");
				
				context.refresh();
				
			    customerDAO =(CustomerDAO)context.getBean("customerDAO");
				customer=(Customer)context.getBean("customer");
			}
				
			 	//ADD CASE TEST
				@Test
					public void addCustomerTestCase(){
						customer.setAccountName("Savings");
						customer.setFirstName("RameshKaushal");
						customer.setLastName("Singh");
						customer.setDateOfBirth("28");
						customer.setMonthOfBirth("August");
						customer.setYearOfBirth("1991");
						customer.setMotherName("Manorma Singh");
						customer.setEmailId("kaushalramesh@gmail.com");
						customer.setGender("Male");
						customer.setMaritalStatus("No");
						customer.setHouseNo("123");
						customer.setStreetNo("4");
						customer.setState("Punjab");
						customer.setCity("Punjab");
						customer.setPincode("234566");
						customer.setPhone("9876543212");
						customer.setUserName("RameshKaushal Singh");
						customer.setPassword("1234");
						
						assertEquals("addCustomerTestCase",customerDAO.save(customer),true);
	}	
				
				

		}

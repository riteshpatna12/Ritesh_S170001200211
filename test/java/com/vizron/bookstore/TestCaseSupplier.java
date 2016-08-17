package com.vizron.bookstore;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookstore.dao.SupplierDAO;
import com.vizron.bookstore.model.Supplier;

	public class TestCaseSupplier{
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	Supplier supplier;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	 	public void init(){
		
		context= new AnnotationConfigApplicationContext();
		context.scan("com.vizron.bookstore");
		context.refresh();
		supplierDAO =(SupplierDAO)context.getBean("supplierDAO");
		supplier=(Supplier)context.getBean("supplier");
	}
		
	 /*   @Test
		public void supplierListTestCase(){
			List<Supplier> list= supplierDAO.list();
			int rowCount=list.size();
				assertEquals("Supplier list test case",rowCount,5);
			
		}*/
		
		@Test
		public void getSupplierTestCase(){
			
			assertEquals("getSupplierTestCase",supplierDAO.get("SP-101"),true);
		}

		/*@Test
		public void addTestCase(){
			
		supplier.setSupplierId("SP-105");
		supplier.setSupplierName("Masha Book House");
		supplier.setSupplierAddress("Gujrat");
			
			boolean flag=supplierDAO.save(supplier);
			assertEquals(flag,true);
		}*/
	
		
	}


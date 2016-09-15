package com.vizron.bookshop;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookshop.dao.SupplierDAO;
import com.vizron.bookshop.model.Supplier;


public class TestCaseSupplier {


	

	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	Supplier supplier;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.vizron");
		context.refresh();
		
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		supplier = (Supplier) context.getBean("supplier");
	}
	
	//@Test
	public void addSupplierTestCase()
	{
		supplier.setId("SPL-01");
		supplier.setName("Ganesh book hose");
		supplier.setAddress("Patna");
		
			//supplierDAO.save(supplier);
			
		assertEquals("addSupplierTestCase() ...", supplierDAO.save(supplier),true);
	}
	//@Test
	public void updateSupplierTestCase()
	{
		supplier.setId("SPL-02");
		supplier.setName("Gyan ganga book house");
		supplier.setAddress("bhopal");
		assertEquals("updateSupplierTestCase() ...", supplierDAO.update(supplier),true);
	}
	
	//@Test
	public void deleteSupplierTestCase()
	{
		supplier.setId("SPL-01");
		boolean flag=supplierDAO.delete(supplier);
		
		assertEquals(" deleteSupplierCase()", flag,true);
	}
	
	//@Test
	public void getSupplierTestCase()
	{
		assertEquals("getSupplierTestCase()..",supplierDAO.get("SPL-01"),null);
	}
	
	//@Test
	public void supplierListTestCase()
	{
			List <Supplier> list=supplierDAO.list();
			int rowCount=list.size();
			assertEquals("Supplier List Count = "  ,rowCount, 1);
			//assertEquals("listSupplierTestCase() ...", supplierDAO.list().size(),3);
	}
}

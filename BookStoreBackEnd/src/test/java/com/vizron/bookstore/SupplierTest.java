package com.vizron.bookstore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vizron.bookstore.dao.SupplierDAO;
import com.vizron.bookstore.model.Supplier;

public class SupplierTest {
	
		
			public static void main(String[] args) {
				
				AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
					context.scan("com.vizron.bookstore");
					context.refresh();
					
					
					
					SupplierDAO supplierDAO= (SupplierDAO)context.getBean("supplierDAO");
					Supplier supplier=(Supplier)context.getBean("supplier");
						supplier.setSupplierId("SP-102");
						supplier.setSupplierName("Gyanganga Book House");
						supplier.setSupplierAddress("New Delhi");
						
						if(supplierDAO.save(supplier)==true){
							
							System.out.println("created successfully ");
						}else {
							
							System.out.println("not created");
						}
						
						
						
						
			}
}

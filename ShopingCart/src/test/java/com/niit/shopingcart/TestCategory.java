package com.niit.shopingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		    context.scan("com.niit");
		    context.refresh();
		    context.getBean("category");
		    context.getBean("product");
		     System.out.println("Bean created successfuly");
		
	}

}

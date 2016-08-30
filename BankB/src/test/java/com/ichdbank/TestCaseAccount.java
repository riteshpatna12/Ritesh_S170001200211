package com.ichdbank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ichdbank.dao.AccountDAO;

import com.ichdbank.model.Account;


public class TestCaseAccount {

	@Autowired
	AccountDAO accountDAO;
	
	@Autowired
	Account account;
	AnnotationConfigApplicationContext context;
	
		@Before
		public void init(){
		
				context=new AnnotationConfigApplicationContext();
				context.scan("com.ichdbank");
				context.refresh();
		
				accountDAO =(AccountDAO)context.getBean("accountDAO");
				account=(Account)context.getBean("account");
	}
		//ADD CASE TEST
    	@Test
			public void addAccountTestCase(){
				account.setAccountNumber("AC-1001");
				account.setAccountCreationDate("25 OCTOBER 1989");
				account.setBalance(200000);
				account.setAccountType("");
				assertEquals("addAccountTestCase",accountDAO.save(account),true);
}	
	
	
}


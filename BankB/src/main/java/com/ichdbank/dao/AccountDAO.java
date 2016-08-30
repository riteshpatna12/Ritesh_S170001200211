package com.ichdbank.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ichdbank.model.Account;
import com.ichdbank.model.Customer;

@Repository
public interface AccountDAO {
	
	public boolean save(Account account);
	
	public boolean update(Account account);
	
	public boolean delete(Account account);
	
	public Customer get(String accountNumber);
	
	public List<Account> list();
	

}




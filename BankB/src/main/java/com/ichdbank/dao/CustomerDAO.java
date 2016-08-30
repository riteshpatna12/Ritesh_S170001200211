package com.ichdbank.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ichdbank.model.Customer;


@Repository
public interface CustomerDAO {
	public boolean save(Customer customer);
	
	public boolean update(Customer customer);
	
	public boolean delete(Customer customer);
	
	public Customer get(String emailId);
	
	public List<Customer> list();
	

}

package com.vizron.bookstore.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vizron.bookstore.model.Supplier;

@Repository
public interface SupplierDAO {
	
	//Declare all curd operation
	public boolean save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public Supplier get(String id);
	
	public List<Supplier> list();
}
package com.vizron.bookshop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vizron.bookshop.model.Book;

@Repository // database repository
public interface BookDAO {
	
	public boolean save(Book book);
	public boolean update(Book book);
	public boolean delete(Book book);
	public Book get(String id);
	public List<Book> list();
	

}


package com.vizron.spring.dao;

	import java.util.List;

import org.springframework.stereotype.Repository;

import com.vizron.bookstore.model.Book;
import com.vizron.bookstore.model.User;

	@Repository
	public interface BookDAO {
	
	public void addBook(Book book);
	
	public void updateBook(Book book);
	
	public void deleteBook(Book book);
	
	public Book getBookById(String BookId);
	
	public List<Book> listBooks();

}

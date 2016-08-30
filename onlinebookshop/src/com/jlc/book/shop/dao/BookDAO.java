package com.jlc.book.shop.dao;

import java.util.List;

import com.jlc.book.shop.to.BookTo;

public interface BookDAO {
	
	public boolean addBook(BookTo bto);
	public boolean alreadyExist(BookTo bto);
	public List searchBook(BookTo bto,int start,int numberOfBook);
	public int getTotalNumberOfBook(BookTo bto);
	public boolean deleteBook(int bookId);
	public BookTo getBookByBookId(String bid);
	

}

package com.jlc.book.shop.delegate;

import java.util.List;

import com.jlc.book.shop.dao.BookDAO;
import com.jlc.book.shop.factory.DAOFactory;
import com.jlc.book.shop.to.BookTo;

public class BookDelegate {
	
	private static BookDAO bookDAO=null;
	static{
			bookDAO=DAOFactory.getBookDAO();
	}
	
	public static boolean addBook(BookTo bto){
		return bookDAO.addBook(bto);
	}
	
	public static boolean alreadyExist(BookTo bto){
		return bookDAO.alreadyExist(bto);
	}
	
	public static List searchBook(BookTo bto,int start,int numberOfBook){
		return bookDAO.searchBook(bto,start,numberOfBook);
	}
	
	public static int getTotalNumberOfBook(BookTo bto){
		return bookDAO.getTotalNumberOfBook(bto);
	}
	
	public static boolean deleteBook(int bookId){
		return bookDAO.deleteBook(bookId);
	}
	
	public static BookTo getBookByBookId(String bid){
		return bookDAO.getBookByBookId(bid);
	}

}

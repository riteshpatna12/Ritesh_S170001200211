package com.jlc.book.shop.factory;

import com.jlc.book.shop.dao.BookDAO;
import com.jlc.book.shop.dao.JDBCBookDAO;
import com.jlc.book.shop.dao.JDBCOrderDAO;
import com.jlc.book.shop.dao.JDBCUserDAO;
import com.jlc.book.shop.dao.OrderDAO;
import com.jlc.book.shop.dao.UserDAO;

public class DAOFactory {
	
	private static UserDAO userDAO;
	private static BookDAO bookDAO;
	private static OrderDAO orderDAO;
	
	static{
			userDAO= new JDBCUserDAO();
			bookDAO= new JDBCBookDAO();
			orderDAO= new JDBCOrderDAO();
	}
	
	public static UserDAO getUserDAO(){
		return userDAO;
	}
	
	public static BookDAO getBookDAO(){
		return bookDAO;
	}
	
	public static OrderDAO getOrderDAO(){
		return orderDAO;
	}

}

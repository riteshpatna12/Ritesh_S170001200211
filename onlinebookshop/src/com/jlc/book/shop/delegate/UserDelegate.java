package com.jlc.book.shop.delegate;

import com.jlc.book.shop.dao.UserDAO;
import com.jlc.book.shop.factory.DAOFactory;
import com.jlc.book.shop.to.UserTo;

public class UserDelegate {
	
	private static UserDAO userDAO;
	static{
			userDAO=DAOFactory.getUserDAO();
	}
	
	public static UserTo verifyUser(String username,String password){
		return userDAO.verifyUser(username, password);
	}
	
	public UserTo changePassword(UserTo usto,String password){
		return userDAO.changePassword(usto, password);
	}
	
	public String searchPassword(String username,String email){
		return userDAO.searchPassword(username, email);
	}
	
	public boolean registerUser(UserTo usto){
		return userDAO.registerUser(usto);
	}
	
	public boolean alreadyExit(String username){
		return userDAO.alreadyExit(username);
	}
	
	public boolean updateUserInfo(String userId,String email,long phone){
		return userDAO.updateUserInfo(userId, email, phone);
	}
	public UserTo getUserInfoById(String userId){
		return userDAO.getUserInfoById(userId);
	}

}


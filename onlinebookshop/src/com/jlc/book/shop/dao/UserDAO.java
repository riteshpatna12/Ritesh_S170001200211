package com.jlc.book.shop.dao;

import com.jlc.book.shop.to.UserTo;

public interface UserDAO {
	
	public UserTo verifyUser(String username,String password);
	public UserTo changePassword(UserTo usto,String password);
	public String searchPassword(String username,String email);
	public boolean registerUser(UserTo usto);
	public boolean alreadyExit(String username);
	public boolean updateUserInfo(String userId,String email,long phone);
	public UserTo getUserInfoById(String userId);
}

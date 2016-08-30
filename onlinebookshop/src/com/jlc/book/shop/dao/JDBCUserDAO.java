package com.jlc.book.shop.dao;

import com.jlc.book.shop.to.UserTo;

public class JDBCUserDAO implements UserDAO {

	@Override
	public UserTo verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserTo changePassword(UserTo usto, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchPassword(String username, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerUser(UserTo usto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alreadyExit(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserInfo(String userId, String email, long phone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserTo getUserInfoById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}

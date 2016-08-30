package com.jlc.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlc.book.shop.delegate.UserDelegate;
import com.jlc.book.shop.to.UserTo;
import com.jlc.book.shop.validator.JLCDataValidator;

public class LoginAction {

	public String verifyUser(HttpServletRequest req,HttpServletResponse res){
		String page="index.jsp";
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		boolean interactWithDB=true;
		if(!JLCDataValidator.validateRequried(uname)){
			req.setAttribute("uname","User name is requried");
			 interactWithDB=false;
		}
		if(!JLCDataValidator.validateRequried(pass)){
			req.setAttribute("pass","Password is requried");
			 interactWithDB=false;
		}
		if(interactWithDB){
			UserTo uto=UserDelegate.verifyUser(uname,pass);
			if(uto!=null){
				req.getSession().setAttribute("USER_TO", uto);
				page="userHomeDef.jsp";
			}else{
				 req.setAttribute("loginError","Username and password is invalid");
			}
		}
		return page;
	}
}

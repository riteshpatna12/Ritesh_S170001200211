package com.jlc.book.shop.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlc.book.shop.action.*;


public class JLCBookShopServlet extends HttpServlet {

	LoginAction loginAction=null;
	LogoutAction logoutAction=null;
	ChangePasswordAction changePasswordAction=null;
	AddBookAction addBookAction=null;
	SearchBookAction searchBookAction=null;
	SortBookInfoAction sortBookInfoAction=null;
	ForgetPasswordAction forgetPasswordAction=null;
	RegisterAction registerAction=null;
	NextAction nextAction=null;
	PreviousAction previousAction=null;
	DeleteBookAction deleteBookAction=null;
	AddBookToCartAction addBookToCartAction=null;
	RemoveBookToCartAction removeBookToCartAction=null;
	PlaceOrderAction placeOrderAction=null;
	EditInfoAction editInfoAction=null;
	CancelEditInfoAction cancelEditInfoAction=null;
	UpdateInfoAction updateInfoAction=null;
	AllOrdersAction allOrderAction=null;
	UserOrderStatusAction userOrderStatusAction=null;
	UpdateOrderStatusAction updateOrderStatusAction=null;
	ShowOrderInfoAction showOrderInfoAction=null;
	ShowUserInfoAction showUserInfoAction=null;
	
	
	public void init(ServletConfig config)throws ServletException{
		super.init(config);
		
		loginAction=new LoginAction();
	    logoutAction=new LogoutAction();
		changePasswordAction=new ChangePasswordAction();
		addBookAction=new AddBookAction();
		searchBookAction=new SearchBookAction();
		sortBookInfoAction=new SortBookInfoAction();
		forgetPasswordAction=new ForgetPasswordAction();
		registerAction=new RegisterAction();
		nextAction=new NextAction();
		previousAction=new PreviousAction();
		deleteBookAction=new DeleteBookAction();
		addBookToCartAction=new AddBookToCartAction();
		removeBookToCartAction=new RemoveBookToCartAction();
		placeOrderAction=new PlaceOrderAction();
		editInfoAction=new EditInfoAction();
		cancelEditInfoAction=new CancelEditInfoAction();
		updateInfoAction=new UpdateInfoAction();
		allOrderAction=new AllOrdersAction();
		userOrderStatusAction=new UserOrderStatusAction();
		updateOrderStatusAction=new UpdateOrderStatusAction();
		showOrderInfoAction=new ShowOrderInfoAction();
		showUserInfoAction=new ShowUserInfoAction();
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
			String uri=request.getRequestURI();
			String page="";
			if(uri.endsWith("login.jlc")){
				page=loginAction.verifyUser(request,response);
			}else if(uri.endsWith("logout.jlc")){
				page=logoutAction.logout(request,response);
			}else if(uri.endsWith("changePassword.jlc")){
				page=changePassworAction.changePassword(request,response);
			}else if(uri.endsWith("addBook.jlc")){
				page=addBookAction.
			}
	}
}

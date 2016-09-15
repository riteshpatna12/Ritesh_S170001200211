package com.vizron.bookstore.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.dao.UserDAO;
import com.vizron.bookstore.model.Category;
import com.vizron.bookstore.model.User;

@Controller
public class UserController {
	
	//Logger log=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	
	
	
	@RequestMapping("/isValidUser")
	public ModelAndView login(@RequestParam(value="name")String emailId,
								@RequestParam(value="password")String password,HttpSession session)
	{
		
		ModelAndView mv = new ModelAndView("home");
		
		String msg;
		
		 user=userDAO.isValidUser(emailId, password);
		if(user==null)
		{
			msg="Invalid User...";
			mv.addObject("Login",false);
			mv.addObject("Loggedin","false");
			session.setAttribute("Invalid User","Invalid user or wrong password");
		}
		else
		{
			if(user.getRole().equals("ROLE_ADMIN"))
			{
				mv= new ModelAndView("home");
				mv.addObject("isAdminLogin","true");
				
			}
			else
				mv.addObject("isAdminLogin","false");
			
			//mv.addObject("Welcome ",user.getName());
			session.setAttribute("welcomeFName", user.getFirstName());
			session.setAttribute("welcomeLName", user.getLastName());
			session.setAttribute("welcomeId", user.getEmailId());
			session.setAttribute("LoggedIn", true);
			
		}
		
		//log.debug("Ending of the method login");
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("/home");
		session.invalidate();
		session = request.getSession(true);
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categoryDAO.categoryList());
		session.setAttribute("Login", false);
		session.setAttribute("LoggedIn", false);
		
		mv.addObject("cSize",categoryDAO.categoryList().size());
		mv.addObject("logoutMessage", "You successfully logged out");
		mv.addObject(" ", "true");
	
		return mv;
	 }


}

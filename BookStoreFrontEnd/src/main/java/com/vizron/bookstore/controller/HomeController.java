package com.vizron.bookstore.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.dao.UserDAO;
import com.vizron.bookstore.model.Category;
import com.vizron.bookstore.model.User;


	@Controller
	public class HomeController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	User user;
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	Category category;
	
		
		
		
		/*@RequestMapping("/")
		public String homePage()
		{
			return "home";
		}*/
		
		@RequestMapping(value={"/","/home"})
		public ModelAndView home()
		{
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("message","Thank you for visiting this site");
			//get all categories and along with products
			List<Category> categoryList=categoryDAO.categoryList();
			mv.addObject("categoryList",categoryList);
			mv.addObject("cSize",categoryList.size());
			System.out.println("Size :"+categoryList.size());
			
			//You have to integrate frontend project to back end project 
			return mv;
		}
		
		@RequestMapping(value = "user/register", method = RequestMethod.POST)
		public ModelAndView registerUser(@ModelAttribute("user")User user) {
			userDAO.save(user);
			ModelAndView mv  = new ModelAndView("/home");
			if(userDAO.get(user.getEmailId())==null)
			{
				userDAO.save(user);
				mv.addObject("successMessage", "You are successfully register");
			}
			else
			{
				mv.addObject("msg","User already exists with this ID");
			}
			
			
			return mv;
		}
		@RequestMapping("/register")
		public ModelAndView register()
		{
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("userObject",user);
			mv.addObject("Register","true");
			return mv;
		}
		@RequestMapping("/login")
		public ModelAndView login()
		{
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("Login","true");
			
			return mv;
		}

	}

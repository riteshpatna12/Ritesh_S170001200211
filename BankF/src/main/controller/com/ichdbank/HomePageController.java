package com.ichdbank;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

	
	
	@RequestMapping("/HomePage")
	public ModelAndView bookstoreHomePage(){
		ModelAndView mv= new ModelAndView("HomePage")
		mv.addObject("message","Thank you for visiting this url");
		
		return mv;
	}
	
	/*@RequestMapping("/new_user_reg.jsp")
	public ModelAndView register(){
		
		ModelAndView mv= new ModelAndView("new_user_reg.jsp");
		mv.addObject("userClickedRegisterhere","true" );
		
	}
	@RequestMapping("/login")
	public ModelAndView login(){
		
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("userClickedLoginHere","true");
		
	}*/
	
	
	

}


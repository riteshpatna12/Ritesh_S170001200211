package com.vizron.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(){
		return "Home";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	
	@RequestMapping("/contactus")
	public String contact(){
		return "contactus";
	}
	
	
}

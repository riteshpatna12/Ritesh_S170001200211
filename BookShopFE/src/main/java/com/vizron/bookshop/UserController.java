package com.vizron.bookshop;

import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	Logger log=loggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private Cart cart;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value="name")String id,@RequestParam(value="password")String password,HttpSession session){
		
		log.debug("Starting of the method login");
		log.info("userId is {} password is", userId,password);
		
		ModelAndView mv= new ModelAndView("home");
		boolean isValidUser=userDAO.isValidUser(userId,password);
		if(isVaildUser==true){
			user=userDAO.get(userID);
			session.setAttribute("loggedInUser",user.getName());
			session.setAttribute("loggedInUserID", user.getId);
			
			session.setAttribute("user",user);
			
			if(user.getAdmin()==1){
				mv.addAllObject("isAdmin","true");
			}else{
				mv.addObject("isAdmin", "false");
				cart=cartDAO.get(userID);
				mv.addObject("cart",cart);
				List<cart> cartList=cartDAO.list(userID);
				mv.addObject("cartList", cartList);
				mv.addObject("carSize", cartList.size)
			}
		}else{
			mv.addObject("invalidCredentials", "true");
			mv.addObject("errorMesage","Invalid Credentials");
		}	
		log.debug("Ending of the method Login");
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpRequest request,HttpSession session){
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("isAdmin", "true");
	}
}	else{
	     mv.addObject("isAdmin","false");
	     cart=cartDAO.get(userID);
	     List<cart> cartList=cartDAO.list(userID);
			mv.addObject("cartList", cartList);
			mv.addObject("carSize", cartList.size)
		}
	}else{
		mv.addObject("invalidCredentials", "true");
		mv.addObject("errorMesage","Invalid Credentials");
	}	
	log.debug("Ending of the method Login");
	return mv;
	}
	@RequestMapping("/logout")
	public ModelAndView logout(HttpRequest request, HttpSession){
		session=request.getSession(true);
		session.setAttribute("category",category);
		session.setAttribute("categoryList",categoryDAO.list());
		
		mv.addObject("logoutMessage","you successfully logout");
		mv.addObject("logout","true");
		return mv;
	}
	}

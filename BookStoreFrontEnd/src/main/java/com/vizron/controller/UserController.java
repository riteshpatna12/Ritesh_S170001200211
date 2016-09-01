/*package com.vizron.bookstorefrontend;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vizron.bookstore.dao.UserDAO;
import com.vizron.bookstore.model.User;

@Controller
public class UserController {
	
	//when the user click on login based on the credentials ,i want to find wheteher he is admin or not
	//if he is admin,i want to navigate to adminHome
	//if he is not,i want to navigate to home page.
	//otherwise error will display.
	@Autowired
	UserDAO userDAO;
	@Autowired
	User user;
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value="emailId") String id,@RequestParam(value="password")String password,HttpSession session){
		
		ModelAndView mv=new ModelAndView("Home");
		String msg;
		user=userDAO.isValidUser(emailId,password);
		if(user==null){
			msg="Invalid user...";
		}else{
			
			if(user.getRole().equals("ROLE_ADMIN")){
				mv=new ModelAndView("adminHome");
			}
			
			session.setAttribute("welcomeFn", user.getFirstName());
			session.setAttribute("welcomeLn", user.getLastName());
			session.setAttribute("emailId", user.getEmailId());
			
		}
	}
				
	
	
	

}
*/
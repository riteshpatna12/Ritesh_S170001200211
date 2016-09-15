package com.vizron.bookshop;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	User user;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private Category category;
	
	/*@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}*/
	
	@RequestMapping("/")
	public ModelAndView onLoad(HttpSession session){
		log.debug("Starting of the method on Load");
			ModelAndView mv= new ModelAndView("/home");
			session.setAttribute("category", category);
			session.setAttribute("categoryList",categoryList);
			System.out.println("size:"+categoryDAO.list());
			log.debug("Ending of method onLoad");
			return mv;
	}
	
	
	@RequestMapping(value="user/register",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user)
	{
		ModelAndView mv=new ModelAndView("/home");
		if(userDAO.get(user.getId())==null){
			userDAO.saveOrUpdate(userDetails);
			mv.addObject("successMessage","you are successfully register");
			}else{
				mv.addObject("msg", "User exist with this id"");
			}
		return mv;
	}
	
	@RequestMapping("/registerHere")
	public ModelAndView registerHere()
	{
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("user"",user);
		mv.addObject("isUserClickdRegisterHere","true");
				return mv;
	}
	
	@RequestMapping("/loginHere")
	public ModelAndView loginHere()
	{
		System.out.println("loginHere");
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("user"",user);
	    mv.addObject("isUserClickdRegisterHere","true");
	    return mv;
	}

}

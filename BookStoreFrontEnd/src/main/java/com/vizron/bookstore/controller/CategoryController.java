 package com.vizron.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.model.Category;


@Controller
public class CategoryController {

	//private static Logger log=LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private Category category;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public String listCategory(Model model)
	{
		//log.debug("");
		model.addAttribute("category",category);
		model.addAttribute("categoryList", categoryDAO.categoryList());
		//log.debug("");
		return "category";
	}
	
	@RequestMapping(value="/category/add",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute("category")Category category){
		
		//log.debug("");
		ModelAndView mv= new ModelAndView();
		if(categoryDAO.getCategory(category.getCategoryId())==null)
		{
			categoryDAO.save(category);
		}
		else
		{
			mv.addObject("errormsg","This id already exists "+category.getCategoryId());
		}
		categoryDAO.save(category);
		//log.debug("");
		return "category";
	}
	
	
	@RequestMapping("category/remove/{categoryId}")
	public ModelAndView deleteCategory(@PathVariable("categoryId") String categoryId) throws Exception
	{
		//category=categoryDAO.getCategory(categoryId);
		boolean flag=categoryDAO.delete(category); 
		ModelAndView mv=new ModelAndView("category");
		String msg="Successfully done the operation";
		if(flag!=true)
		{
			
			 msg="The operation could not success";
		}		
		mv.addObject("msg",msg);
		return mv;
	}
	
	@RequestMapping("category/edit/{id}")
	public ModelAndView deleteCategory(@ModelAttribute("category")Category category) throws Exception
	{
		ModelAndView mv=new ModelAndView();
		if(categoryDAO.getCategory(category.getCategoryId())!=null)
		{
			categoryDAO.update(category);
			mv.addObject("message", "Updated successfully");
		}
		else
		{
			mv.addObject("errmesg","could not update category");
		}
		
		return mv;
	}
	
}



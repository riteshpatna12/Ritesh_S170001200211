package com.vizron.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vizron.bookstore.dao.BookDAO;
import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.dao.SupplierDAO;
import com.vizron.bookstore.model.Book;
import com.vizron.bookstore.model.Category;
import com.vizron.bookstore.model.Supplier;

@Controller
public class AdminController {
	
	@Autowired
	private Book book;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private Category category;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private BookDAO bookDAO;
	
	
	@RequestMapping("/manageCategories")
	public ModelAndView categories(){
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("category", category);
		mv.addObject("isAdminClickedCategories", "true");
		mv.addObject("categoryList",categoryDAO.categoryList());
		return mv;	
	}
	
	@RequestMapping("/manageBooks")
	public ModelAndView books(){
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("book", book);
		mv.addObject("isAdminClickedbooks", "true");
		mv.addObject("bookList",bookDAO.list());
		return mv;	
	}
	
	@RequestMapping("/manageSuppliers")
	public ModelAndView suppliers(){
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("supplier", supplier);
		mv.addObject("isAdminClickedsuppliers", "true");
		mv.addObject("supplierList",supplierDAO.list());
		return mv;	
	}

}

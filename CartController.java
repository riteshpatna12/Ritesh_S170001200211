package com.vizron.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vizron.bookstore.dao.BookDAO;
import com.vizron.bookstore.dao.CartDAO;
import com.vizron.bookstore.dao.CategoryDAO;
import com.vizron.bookstore.model.Book;
import com.vizron.bookstore.model.Cart;
import com.vizron.bookstore.model.Category;




@Controller
public class CartController {
	
	
	@Autowired(required=true)
	private CartDAO cartDAO;
	
	@Autowired(required=true)
	private BookDAO bookDAO;
	
	@Autowired(required=true)
	private CategoryDAO categoryDAO;

	
	@RequestMapping(value = "/myCart", method = RequestMethod.GET)
	public String myCart(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("categoryList", categoryDAO.categoryList());
	
		model.addAttribute("cart", new Cart());
		model.addAttribute("cartList", this.cartDAO.list());
		model.addAttribute("totalAmount", cartDAO.getTotalAmount("user")); // Just to test, passwrdo user
		model.addAttribute("displayCart", "true");
		return "/home";
	}
	
	
	/*@RequestMapping(value = "/carts", method = RequestMethod.GET)
	public String listCarts(Model model) {
		model.addAttribute("cart", new Cart());
		model.addAttribute("cartList", this.cartDAO.list());
		return "cart";
	}*/
	
	
	//For add and update cart both
	@RequestMapping(value= "/cart/add/{id}", method = RequestMethod.GET)
	public String addToCart(@PathVariable("id") String id){
		
	
	 Book book = bookDAO.get(id);
	 Cart cart = new Cart();
	 cart.setPrice(book.getPrice());
	 cart.setProductName(book.getName());
	 cart.setQuantity(1);
	 cart.setUserID("user");  //  id should keep session and use the same id
	 cart.setStatus('N');  // 
		cartDAO.saveOrUpdate(cart);
		//return "redirect:/views/home.jsp";
		return "redirect:/onLoad";
		
	}
	
	@RequestMapping("cart/remove/{id}")
    public String removeCart(@PathVariable("id") String id,ModelMap model) throws Exception{
		
       try {
		cartDAO.delete(id);
		model.addAttribute("message","Successfully removed");
	} catch (Exception e) {
		model.addAttribute("message",e.getMessage());
		e.printStackTrace();
	}
       //redirectAttrs.addFlashAttribute(arg0, arg1)
        return "redirect:/home";
    }
 
    @RequestMapping("cart/edit/{id}")
    public String editCart(@PathVariable("id") String id, Model model){
    	System.out.println("editCart");
        model.addAttribute("cart", this.cartDAO.get(id));
        model.addAttribute("listCarts", this.cartDAO.list());
        return "cart";
    }
	}


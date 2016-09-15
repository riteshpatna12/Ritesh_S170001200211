package com.vizron.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vizron.bookstore.dao.SupplierDAO;
import com.vizron.bookstore.model.Supplier;

@Controller

public class SupplierController {

	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired(required=true)
	@Qualifier(value="supplierDAO")
	public void setSupplierDAO(SupplierDAO sd){
		this.supplierDAO=sd;
	}
	
	@RequestMapping(value="/suppliers", method=RequestMethod.GET)
	public String listSuppliers(Model model){
		model.addAttribute("supplier",new Supplier());
		model.addAttribute("supplierList",this.supplierDAO.list());
		return "supplier";
		
		
	}
	
	@RequestMapping(value="/supplier/add",method=RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier")Supplier supplier){
		
		//log.debug("");
		ModelAndView mv= new ModelAndView();
		if(supplierDAO.get(supplier.getSupplierId())==null)
		{
			supplierDAO.save(supplier);
		}
		else
		{
			mv.addObject("errormsg","This id already exists "+supplier.getSupplierId());
		}
		supplierDAO.save(supplier);
		//log.debug("");
		return "supplier";
	}
	
	
	@RequestMapping("supplier/remove/{supplierId}")
	public ModelAndView deleteSupplier(@PathVariable("supplierId")String supplierId) throws Exception
	{
		//supplier=supplierDAO.getsupplier(supplierId);
		boolean flag=supplierDAO.delete(supplier); 
		ModelAndView mv=new ModelAndView("supplier");
		String msg="Successfully done the operation";
		if(flag!=true)
		{
			
			 msg="The operation could not success";
		}		
		mv.addObject("msg",msg);
		return mv;
	}
	
	@RequestMapping("supplier/edit/{supplierId}")
	public ModelAndView deleteSupplier(@ModelAttribute("supplier")Supplier supplier) throws Exception
	{
		ModelAndView mv=new ModelAndView();
		if(supplierDAO.get(supplier.getSupplierId())!=null)
		{
			supplierDAO.update(supplier);
			mv.addObject("message", "Updated successfully");
		}
		else
		{
			mv.addObject("errmesg","could not updatesupplier");
		}
		
		return mv;
	}
	
}



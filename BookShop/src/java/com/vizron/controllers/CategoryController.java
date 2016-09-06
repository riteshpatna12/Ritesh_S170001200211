/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.controllers;

import com.vizron.model.Category;
import com.vizron.service.CategoryService;
import java.util.Map;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ritesh
 */
@Controller
@RequestMapping("/admin")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/manageCategories")
    public String showManageCategories(Map<String,Object> map){
    map.put("category",new Category());
    map.put("categoryList",categoryService.listCategory()); 
    return "manageCategories";
    }
    
    @RequestMapping(value="/saveCategory", method=RequestMethod.POST)
    public String saveCategory(Map<String,Object> map,@ModelAttribute("category")Category category,@Valid Category categoryValid,BindingResult result){
    if(result.hasErrors()){
        return "manageCategories";
    }else{
        try{
            categoryService.saveCategory(category);
            return "redirect:/admin/manageCategories";
        }catch(ConstraintViolationException exp){
            map.put("dbError",exp.getMessage());
            return "manageCategories";
        } 
    }
            
    }
    @RequestMapping("/deleteCategory/{categoryNo}")
    public String deleteCategory(Map<String,Object> map,@PathVariable("categoryNo")Integer categoryNo){
    
        try{
            categoryService.removeCategory(categoryNo);
            return "redirect:/admin/manageCategories";
        }catch(DataIntegrityViolationException exp){
            map.put("dbError","Cannot delete a parent row");
            map.put("category",new Category());
            return "manageCategories";
        }
    }
    
    @RequestMapping("/editCategory/{categoryNo}")
    public String editCategory(Map<String,Object> map,@PathVariable("categoryNo")Integer categoryNo){
            map.put("category",categoryService.getCategoryById(categoryNo));
            return "manageCategories";
    
    }
    
    
    
    
    
}

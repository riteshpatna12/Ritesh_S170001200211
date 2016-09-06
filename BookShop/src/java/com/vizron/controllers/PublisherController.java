/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.controllers;

import com.vizron.model.Category;
import com.vizron.model.Publishers;
import com.vizron.service.CountryService;
import com.vizron.service.PublisherService;
import com.vizron.service.StateService;
import java.util.Map;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
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
public class PublisherController {
    
 @Autowired
 private PublisherService publisherService;
 
 @Autowired
 private CountryService countryService;
 
 @Autowired
 private StateService stateService;
 
 @RequestMapping("/managePublishers")
 public String showManagePublisher(Map<String,Object> map){
     map.put("publishers",new Publishers());
     map.put("publisherList", publisherService.listPublisher());
     map.put("countryList",countryService.listCountry());
     map.put("stateList",stateService.listState());
     return "managePublishers";
     
 }
 
 @RequestMapping(value="/savePublisher", method=RequestMethod.POST)
    public String savePublisher(Map<String,Object> map,@ModelAttribute("publisher")Publishers publisher,@Valid Publishers publisherValid,BindingResult result){
    if(result.hasErrors()){
        return "managePublishers";
    }else{
        try{
            publisherService.savePublisher(publisher);
            return "redirect:/admin/managePublishers";
        }catch(ConstraintViolationException exp){
            map.put("dbError",exp.getMessage());
            return "managePublishers";
        } 
    }
            
    }
    @RequestMapping("/deletePublisher/{publisherNo}")
    public String deletePublisher(Map<String,Object> map,@PathVariable("publisherNo")Integer publisherNo){
    
        try{
            publisherService.removePublisher(publisherNo);
            return "redirect:/admin/managePublishers";
        }catch(DataIntegrityViolationException exp){
            map.put("dbError","Cannot delete a parent row");
            map.put("publisher",new Publishers());
            return "managePublishers";
        }
    }
    
    @RequestMapping("/editPublisher/{publisherNo}")
    public String editPublisher(Map<String,Object> map,@PathVariable("publisherNo")Integer publisherNo){
            map.put("publisher",publisherService.getPublisherById(publisherNo));
            return "managePublishers";
    
    } 
    
}
 
 


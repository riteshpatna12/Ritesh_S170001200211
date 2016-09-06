/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.controllers;

import com.vizron.model.Category;
import com.vizron.model.User;
import com.vizron.service.CountryService;
import com.vizron.service.StateService;
import com.vizron.service.UserService;
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
public class UserController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private CountryService countryService;
    
    @Autowired
    private StateService stateService;
    
    @RequestMapping("/manageUsers")
    public String showManageUsers(Map<String,Object> map){
    map.put("user",new User());
    map.put("userList",userService.listUser());
    map.put("countryList",countryService.listCountry());
    map.put("stateList",stateService.listState());
    return "manageUsers";
    }
    
    @RequestMapping(value="/saveUser", method=RequestMethod.POST)
    public String saveUser(Map<String,Object> map,@ModelAttribute("user")User user,@Valid User userValid,BindingResult result){
    if(result.hasErrors()){
        map.put("countryList",countryService.listCountry());
        map.put("stateList",stateService.listState());
        return "manageUsers";
    }else{
        try{
            userService.saveUser(user);
            return "redirect:/admin/manageUsers";
        }catch(ConstraintViolationException exp){
            map.put("dbError",exp.getMessage());
            return "manageUsers";
        } 
    }
            
    }
    
    @RequestMapping("/deleteUser/{userNo}")
    public String deleteUser(Map<String,Object> map,@PathVariable("userNo")Integer userNo){
    
       User user=userService.getUserById(userNo);
       if(!user.getUserName().equals("admin")){
           userService.removeUser(userNo);
           return "redirect:/admin/manageUsers";
       }else{
             map.put("dbError","You cannaot delete the admin user");
             map.put("user",new User());
             map.put("userList",userService.listUser());
             map.put("countryList",countryService.listCountry());
             map.put("stateList",stateService.listState());
              return "manageUsers";
           
       }
       }
    
          @RequestMapping("/editUser/{userNo}")
            public String editUser(Map<String,Object> map,@PathVariable("userNo")Integer userNo){
            map.put("user",userService.getUserById(userNo));
            map.put("countryList",countryService.listCountry());
             map.put("stateList",stateService.listState());
              return "manageUsers";
    
    }
    
    
    
    
    
}
   
            
            

            
        
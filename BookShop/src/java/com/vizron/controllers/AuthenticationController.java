/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ritesh
 */
@Controller
public class AuthenticationController {
    
    @RequestMapping(value="/admin/adminLogin", method=RequestMethod.GET)
    public String showAdminLogin(ModelMap model){
            return "adminLogin";
    }
    
    @RequestMapping(value="/admin/adminLoginFailed", method=RequestMethod.GET)
    public String showAdminLoginError(ModelMap model){
            model.addAttribute("error","true");
            return "adminLogin";
    }
    
    @RequestMapping(value="/admin/adminLogout", method=RequestMethod.GET)
    public String showAdminAfterLogout(ModelMap model){
            return "adminLogin";
    }
    
    @RequestMapping(value="/adminAccessDenied")
    public String showAccessDeniedPage(ModelMap model){
            model.addAttribute("error","true");
            return "adminAccessDenied";
    }
    
}

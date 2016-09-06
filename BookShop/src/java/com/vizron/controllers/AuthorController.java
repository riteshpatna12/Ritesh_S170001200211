/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.controllers;

import com.vizron.model.Author;
import com.vizron.service.AuthorService;
import com.vizron.service.CountryService;
import com.vizron.service.StateService;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.IOUtils;

/**
 *
 * @author ritesh
 */
@Controller
@RequestMapping("/admin")
public class AuthorController {
    
    @Autowired
    private CommonService commonService;
    
    @Autowired
    private AuthorService authorService;
    
    @Autowired
    private CountryService countryService;
    
    @Autowired
    private StateService stateService;
    
    @RequestMapping("/manageAuthors")
        public String showManageAuthors(Map<String,Object> map){
          map.put("author", new Author());
          map.put("authorList",authorService.listAuthor());
          map.put("countryList",countryService.listCountry());
          map.put("stateList",stateService.listState());
          return "manageAuthors";  
        }
        
        @RequestMapping("/downloadAuthorPhotograph/{authorNo}")
        public String downloadAuthorPhotograph(@PathVariable("authorNo")Integer authorNo, HttpServletResponse response){
            Author author= authorService.getAuthorById(authorNo);
            try{
                if(author.getPhotograph()!=null){
                    response.setHeader("Content-Disposition","inline;filename=\""+author.getFirstName()+"\"");
                    OutputStream out=response.getOutputStream();
                    response.setContentType("image/gif");
                   // IOUtils.copy(author.getPhotograph().getBinaryStream(),out);
                    out.flush();
                    out.close();
                }
               }catch(Exception e){
                   e.printStackTrace();
               }
            return null;
        }
        
        @RequestMapping(value="/saveAuthor",method=RequestMethod.POST)
        public String saveAuthor(Map<String,Object> map,@ModelAttribute("author")Author author,@Valid Author authorValid,BindingResult result,@RequestParam("file")MultipartFile file)throws IOException{
            if(result.hasErrors()){
            map.put("countryList",countryService.listCountry());
            map.put("stateList",stateService.listState());
            return "manageAuthors";
            }else{
                if(!file.isEmpty()){
                    author.setPhotograph(commonService.getBlob(file.getBytes()));
                }else{
                    if(author.getAuthorNo()!=null){
                        author.setPhotograph(authorService.getAuthorById(author.getAuthorNo()).getPhotograph());
                        
                    }
                }
                try{
                    authorService.saveAuthor(author);
                    return "redirect:/admin/manageAuthors";              
                }catch(ConstraintViolationException e){
                    map.put("dbError",e.getMessage());
                        return "manageAuthors";
                }
                }
           }
        @RequestMapping("/deleteAuthor/{authorNo}")
        public String deleteAuthor(Map<String,Object> map,@PathVariable("authorNo")Integer authorNo){
            try{
                authorService.removeAuthor(authorNo);
                return "redirect:/admin/manageAuthors";
            }catch(DataIntegrityViolationException exp){
                map.put("dbError", "Cannot delete a parent row.");
                map.put("author",new Author());
                return "manageAuthors";
            }
        }
        
        
        
}
            
            
        


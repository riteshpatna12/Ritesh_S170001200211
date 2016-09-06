/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.controllers;

import com.vizron.model.Author;
import com.vizron.model.Book;
import com.vizron.service.AuthorService;
import com.vizron.service.BookService;
import com.vizron.service.CategoryService;
import com.vizron.service.PublisherService;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
public class BookController {

    @Autowired
    private CommonService commonService;
    
    @Autowired
    private BookService bookService;
    
    @Autowired
    private PublisherService publisherService;
    
    @Autowired
    private CategoryService categoryService;
    
    @Autowired
    private AuthorService authorService;
    
    @RequestMapping("/manageBooks")
        public String showManageBooks(Map<String,Object> map){
          map.put("book", new Book());
          map.put("bookList",bookService.listBook());
          map.put("publisherList",publisherService.listPublisher());
          map.put("authorList",authorService.listAuthor());
          return "manageAuthors";  
        }
        
     @RequestMapping("/downloadBookPhotograph/{bookNo}")
        public String downloadBookPhotograph(@PathVariable("bookNo")Integer bookNo, HttpServletResponse response){
            Book book= bookService.getBookById(bookNo);
            try{
                if(book.getCoverPage()!=null){
                    response.setHeader("Content-Disposition","inline;filename=\""+book.getBookName()+"\"");
                    OutputStream out=response.getOutputStream();
                    response.setContentType("image/gif");
                    IOUtils.copy(book.getCoverPage().getBinaryStream(),out);
                    out.flush();
                    out.close();
                }
               }catch(Exception e){
                   e.printStackTrace();
               }
            return null;
        }
        
    @RequestMapping("/downloadBookTOC/{bookNo}")
        public String downloadBookTOC(@PathVariable("bookNo")Integer bookNo, HttpServletResponse response){
            Book book= bookService.getBookById(bookNo);
            try{
                if(book.getToc()!=null){
                    response.setHeader("Content-Disposition","inline;filename=\""+book.getBookName()+"\"");
                    OutputStream out=response.getOutputStream();
                    response.setContentType("applicatin/pdf");
                   IOUtils.copy(book.getToc().getBinaryStream(),out);
                    out.flush();
                    out.close();
                }
               }catch(Exception e){
                   e.printStackTrace();
               }
            return null;
        }    
        
        @RequestMapping("/downloadBookSampleChapter/{bookNo}")
        public String downloadBookSampleChapter(@PathVariable("bookNo")Integer bookNo, HttpServletResponse response){
            Book book= bookService.getBookById(bookNo);
            try{
                if(book.getSampleChapter()!=null){
                    response.setHeader("Content-Disposition","inline;filename=\""+book.getBookName()+"\"");
                    OutputStream out=response.getOutputStream();
                    response.setContentType("applicatin/pdf");
                   IOUtils.copy(book.getSampleChapter().getBinaryStream(),out);
                    out.flush();
                    out.close();
                }
               }catch(Exception e){
                   e.printStackTrace();
               }
            return null;
        }    
        
        @RequestMapping(value="/saveBook", method =RequestMethod.POST)
        private String saveBook(Map<String,Object> map,@ModelAttribute("book")Book book,@Valid Book bookValid,
                BindingResult result,@RequestParam("coverPageFile")MultipartFile coverPageFile,@RequestParam("tocFile")MultipartFile tocFile,
                 @RequestParam("samplrChapterFile")MultipartFile sampleChapterFile)throws IOException
                {
                    if(result.hasErrors()){
                    map.put("bookList",bookService.listBook());
                    map.put("publisherList",publisherService.listPublisher());
                    map.put("categoryList",categoryService.listCategory());
                    map.put("authorList",authorService.listAuthor());
                    return "manageBooks";
                    }else{
                    if(!coverPageFile.isEmpty()){
                    
                    book.setCoverPage(commonService.getBlob(coverPageFile.getBytes()));
                    }else{
                    if(book.getBookNo()!=null){
                    
                    book.setCoverPage(bookService.getBookById(book.getBookNo()).getCoverPage());
                    }
                    }
                    if(!tocFile.isEmpty()){
                    book.setToc(commonService.getBlob(tocFile.getBytes()));
                    }
                    else{
                    if(book.getBookNo()!=null){
                    book.setToc(bookService.getBookById(book.getBookNo()).getToc());
                    }
                    }
                    if(!sampleChapterFile.isEmpty()){
                    book.setSampleChapter(commomService.getBlob(sampleChapterFile.getBytes()));
                    }
                    else{
                    if(book.getBookNo()!=null){
                    book.setSampleChapter(bookService.getBookById(book.getBookNo()).getSampleChapter());
                    }
                    }
                    try{
                    bookService.saveBook(book);
                    bookService.notifyCustomersByMail(book);
                    return "redirect:/admin/manageBooks";
                    }catch(ConstraintViolationException exp){
                    map.put("dbError",exp.getMessage());
                    return"manageBooks";
                    }
                    }
                }
        @RequestMapping("/deleteBook/{bookNo}")
        public String deleteBook(@PathVariable("bookNo")Integer bookNo){
            
            bookService.removeBook(bookNo);
            return "redirect:/admin/manageBooks";
        }}
            
       
        




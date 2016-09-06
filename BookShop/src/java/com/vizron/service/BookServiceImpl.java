/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.dao.AuthorDAO;
import com.vizron.dao.BookDAO;
import com.vizron.model.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ritesh
 */
@Service
public class BookServiceImpl implements BookService{
    
    @Value("${emailFrom}")
    String emailFrom;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private MailService mailService;
      
    @Autowired
    private BookDAO bookDAO;
    
    @Transactional
    @Override
    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }
    
    @Transactional
    @Override
    public List<Book> listBook() {
        return bookDAO.listBook();
    }
    
    @Transactional
    @Override
    public void removeBook(Integer bookNo) {
        bookDAO.removeBook(bookNo);
    }
    
    @Transactional
    @Override
    public Book getBookById(Integer bookNo) {
        return bookDAO.getBookById(bookNo);
    }

    @Override
    public void notifyCustomersByMail(Book book) {
        List<User> users=userService.listUser();
        for(User user:users){
        String emailMessage="<table width='100%' border='0' align='center' cellpadding='0' cellspacing='0'" + 
                "style='font-family:Verdana,Arial,Helvetica,sans-serif;" + "font-size:12pt; color:#5a5a5a;'><tr><td align='left'>"
                + "<p>Dear"+user.get
                
        }
    }
    
    
    
}


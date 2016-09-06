/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.model.Book;
import java.util.List;

/**
 *
 * @author ritesh
 */
public interface BookService {
    
     public void saveBook(Book book);
        public List<Book> listBook();
        public void removeBook(Integer bookNo);
        public Book getBookById(Integer bookNo);
        public void notifyCustomersByMail(Book book); 
    
    
}

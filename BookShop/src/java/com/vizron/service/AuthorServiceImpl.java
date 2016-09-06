/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.dao.AuthorDAO;
import com.vizron.model.Author;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ritesh
 */
@Service
public class AuthorServiceImpl implements AuthorService{
    
    @Autowired
    private AuthorDAO authorDAO;
    
    @Transactional
    @Override
    public void saveAuthor(Author author) {
        authorDAO.saveAuthor(author);
    }
    
    @Transactional
    @Override
    public List<Author> listAuthor() {
        return authorDAO.listAuthor();
    }
    
    @Transactional
    @Override
    public void removeAuthor(Integer authorNo) {
        authorDAO.removeAuthor(authorNo);
    }
    
    @Transactional
    @Override
    public Author getAuthorById(Integer authorNo) {
        return authorDAO.getAuthorById(authorNo);
        
    }
        
    
    
}

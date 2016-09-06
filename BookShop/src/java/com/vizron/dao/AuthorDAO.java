/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Author;
import java.util.List;

/**
 *
 * @author ritesh
 */
public interface AuthorDAO {
    
        public void saveAuthor(Author author);
        public List<Author> listAuthor();
        public void removeAuthor(Integer authorNo);
        public Author getAuthorById(Integer authorNo);

}

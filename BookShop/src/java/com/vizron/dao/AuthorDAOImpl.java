/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Author;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ritesh
 */
@Repository
public class AuthorDAOImpl implements AuthorDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveAuthor(Author author) {
        sessionFactory.getCurrentSession().merge(author);
    }

    @Override
    public List<Author> listAuthor() {
         return sessionFactory.getCurrentSession().createQuery("from Author").list();
    }

    @Override
    public void removeAuthor(Integer authorNo) {
         Author author=(Author)sessionFactory.getCurrentSession().load(Author.class, authorNo);
         if(null!=author){
             sessionFactory.getCurrentSession().delete(author);
         }
    }

    @Override
    public Author getAuthorById(Integer authorNo) {
         return (Author)sessionFactory.getCurrentSession().get(Author.class, authorNo);
    }
    
}

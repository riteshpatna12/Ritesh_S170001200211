/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Book;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ritesh
 */
@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveBook(Book book) {
        sessionFactory.getCurrentSession().merge(book);
    }

    @Override
    public List<Book> listBook() {
        return sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    @Override
    public void removeBook(Integer bookNo) {
        Book book=(Book)sessionFactory.getCurrentSession().load(Book.class, bookNo);
        if(null!=book){
            sessionFactory.getCurrentSession().delete(book);
      }
    }
    @Override
    public Book getBookById(Integer bookNo) {
        return (Book)sessionFactory.getCurrentSession().get(Book.class, bookNo);
    }
        
    }
    


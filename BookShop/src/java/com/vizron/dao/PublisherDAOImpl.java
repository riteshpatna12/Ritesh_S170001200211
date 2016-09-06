/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Author;
import com.vizron.model.Publishers;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ritesh
 */
@Repository
public class PublisherDAOImpl implements PublisherDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void savePublisher(Publishers publisher) {
        sessionFactory.getCurrentSession().merge(publisher);
    }

    @Override
    public List<Publishers> listPublisher() {
        return sessionFactory.getCurrentSession().createQuery("from Publisher").list();
    }

    @Override
    public void removePublisher(Integer publisherNo) {
        Publishers publisher=(Publishers)sessionFactory.getCurrentSession().load(Publishers.class, publisherNo);
            if(null!=publisher){
                sessionFactory.getCurrentSession().delete(publisher);
            }    
                }

    @Override
    public Publishers getPublisherById(Integer publisherNo) {
        return (Publishers)sessionFactory.getCurrentSession().get(Publishers.class,publisherNo);
        
    }
    
}

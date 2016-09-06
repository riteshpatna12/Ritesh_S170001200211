/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Author;
import com.vizron.model.User;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ritesh
 */
@Repository
public class UserDAOImpl implements UserDAO{
    
@Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().merge(user);
    }

    @Override
    public List<User> listUser() {
         return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    @Override
    public void removeUser(Integer userNo) {
         User user=(User)sessionFactory.getCurrentSession().load(User.class, userNo);
         if(null!=user){
             sessionFactory.getCurrentSession().delete(user);
         }
    }

    @Override
    public User getUserById(Integer userNo) {
         return (User)sessionFactory.getCurrentSession().get(User.class, userNo);
    }
    
}

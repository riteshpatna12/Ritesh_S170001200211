/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Category;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ritesh
 */
 @Repository
public class CategoryDAOImpl implements CategoryDAO{
  
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveCategory(Category category) {
        sessionFactory.getCurrentSession().merge(category);
    }

    @Override
    public List<Category> listCategory() {
         return sessionFactory.getCurrentSession().createQuery("from Category").list();
    }

    @Override
    public void removeCategory(Integer categoryNo) {
         Category category=(Category)sessionFactory.getCurrentSession().load(Category.class, categoryNo);
         if(null!=category){
             sessionFactory.getCurrentSession().delete(category);
         }
    }

    @Override
    public Category getCategoryById(Integer categoryNo) {
         return (Category)sessionFactory.getCurrentSession().get(Category.class, categoryNo);
    }
    
}
    


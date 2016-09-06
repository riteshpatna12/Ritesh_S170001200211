/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.dao.CategoryDAO;
import com.vizron.model.Category;
import com.vizron.model.Country;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ritesh
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    private CategoryDAO categoryDAO;
    
    @Transactional
    @Override
    public void saveCategory(Category category) {
        categoryDAO.saveCategory(category);
    }
    
    @Transactional
    @Override
    public List<Category> listCategory() {
       return categoryDAO.listCategory();
    }
    
    @Transactional
    @Override
    public void removeCategory(Integer categoryNo) {
        categoryDAO.removeCategory(categoryNo);
    }
    
    @Transactional
    @Override
    public Category getCategoryById(Integer categoryNo) {
        return categoryDAO.getCategoryById(categoryNo);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Category;
import java.util.List;

/**
 *
 * @author ritesh
 */
public interface CategoryDAO {
    
        public void saveCategory(Category category);
        public List<Category> listCategory();
        public void removeCategory(Integer categoryNo);
        public Category getCategoryById(Integer categoryNo);
    
}

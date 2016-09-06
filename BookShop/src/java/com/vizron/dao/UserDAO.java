/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Author;
import com.vizron.model.User;
import java.util.List;

/**
 *
 * @author ritesh
 */
public interface UserDAO {
    
      public void saveUser(User user);
        public List<User> listUser();
        public void removeUser(Integer userNo);
        public User getUserById(Integer userNo);
    
}

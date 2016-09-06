/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.dao.UserDAO;
import com.vizron.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ritesh
 */
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDAO userDAO;
    
    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
    
    @Transactional
    @Override
    public List<User> listUser() {
        return userDAO.listUser();
    }
    
    @Transactional
    @Override
    public void removeUser(Integer userNo) {
        userDAO.removeUser(userNo);
    }

    @Override
    public User getUserById(Integer userNo) {
        return userDAO.getUserById(userNo);
    }
    
}

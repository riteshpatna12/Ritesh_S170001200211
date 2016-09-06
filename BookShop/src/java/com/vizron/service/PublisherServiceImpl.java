/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.dao.PublisherDAO;
import com.vizron.model.Publishers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ritesh
 */
@Service
public class PublisherServiceImpl implements PublisherService {
    
    @Autowired
    private PublisherDAO publisherDAO;

    @Override
    public void savePublisher(Publishers publisher) {
        publisherDAO.savePublisher(publisher);
    }
    
    @Transactional
    @Override
    public List<Publishers> listPublisher() {
        return publisherDAO.listPublisher();
        
    }
    
    @Transactional
    @Override
    public void removePublisher(Integer publisherNo) {
        publisherDAO.removePublisher(publisherNo);
        
    }
    
    @Transactional
    @Override
    public Publishers getPublisherById(Integer publisherNo) {
        return publisherDAO.getPublisherById(publisherNo);
    }
    
}

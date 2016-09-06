/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Author;
import com.vizron.model.Publishers;
import java.util.List;

/**
 *
 * @author ritesh
 */
public interface PublisherDAO {
    
      public void savePublisher(Publishers publisher);
        public List<Publishers> listPublisher();
        public void removePublisher(Integer publisherNo);
        public Publishers getPublisherById(Integer publisherNo);
    
}

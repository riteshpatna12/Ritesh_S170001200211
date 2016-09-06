/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Author;
import com.vizron.model.State;
import java.util.List;

/**
 *
 * @author ritesh
 */
public interface StateDAO {
    
     public void saveState(State state);
        public List<State> listState();
        public void removeState(Integer stateNo);
        public State getStateById(Integer stateNo);
    
}

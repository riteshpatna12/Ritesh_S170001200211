/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.dao.StateDAO;
import com.vizron.model.State;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ritesh
 */
@Service
public class StateServiceImpl implements StateService {
    
    @Autowired
    private StateDAO stateDAO;
    
    @Transactional
    @Override
    public void saveState(State state) {
        stateDAO.saveState(state);
    }
    
    @Transactional
    @Override
    public List<State> listState() {
        return stateDAO.listState();
    }
    
    @Transactional
    @Override
    public void removeState(Integer stateNo) {
          stateDAO.removeState(stateNo);
    }
    
    @Transactional
    @Override
    public State getStateById(Integer stateNo) {
        return stateDAO.getStateById(stateNo);
    
    }   
}

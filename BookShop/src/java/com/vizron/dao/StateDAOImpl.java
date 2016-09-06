/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Book;
import com.vizron.model.State;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ritesh
 */
@Repository
public class StateDAOImpl implements StateDAO{

   @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveState(State state) {
        sessionFactory.getCurrentSession().merge(state);
    }

    @Override
    public List<State> listState() {
        return sessionFactory.getCurrentSession().createQuery("from State").list();
    }

    @Override
    public void removeState(Integer stateNo) {
        State state=(State)sessionFactory.getCurrentSession().load(Book.class, stateNo);
        if(null!=state){
            sessionFactory.getCurrentSession().delete(state);
      }
    }
    @Override
    public State getStateById(Integer stateNo) {
        return (State)sessionFactory.getCurrentSession().get(State.class, stateNo);
    }
        
    }
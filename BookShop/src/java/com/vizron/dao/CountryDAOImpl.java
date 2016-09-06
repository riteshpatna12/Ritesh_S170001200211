/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.dao;

import com.vizron.model.Country;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ritesh
 */
@Repository
public class CountryDAOImpl implements CountryDAO {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveCountry(Country country) {
        sessionFactory.getCurrentSession().merge(country);
    }

    @Override
    public List<Country> listCountry() {
        return sessionFactory.getCurrentSession().createQuery("from Country").list();
    }

    @Override
    public void removeCountry(Integer countryNo) {
        Country country=(Country)sessionFactory.getCurrentSession().load(Country.class, countryNo);
         if(null!=country){
        sessionFactory.getCurrentSession().delete(country);
        }
        
    }

    @Override
    public Country getCountryById(Integer countryNo) {
        return (Country)sessionFactory.getCurrentSession().get(Country.class, countryNo);
    }
    
}

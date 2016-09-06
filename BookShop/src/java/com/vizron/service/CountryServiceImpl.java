/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.dao.CountryDAO;
import com.vizron.model.Country;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ritesh
 */
@Service
public class CountryServiceImpl implements CountryService {
    
    @Autowired
    private CountryDAO countryDAO;
    
    @Transactional
    @Override
    public void saveCountry(Country country) {
        countryDAO.saveCountry(country);
    }
    
    @Transactional
    @Override
    public List<Country> listCountry() {
        return countryDAO.listCountry();
    }
    
    @Transactional
    @Override
    public void removeCountry(Integer countryNo) {
        countryDAO.removeCountry(countryNo);
    }
    
    @Transactional
    @Override
    public Country getCountryById(Integer countryNo) {
        return countryDAO.getCountryById(countryNo);
    }
    
    
}

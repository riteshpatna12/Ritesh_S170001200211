/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.service;

import com.vizron.model.Country;
import java.util.List;

/**
 *
 * @author ritesh
 */
public interface CountryService {
    
    public void saveCountry(Country country);
    public List<Country> listCountry();
    public void removeCountry(Integer countryNo);
    public Country getCountryById(Integer countryNo);
    
    
}

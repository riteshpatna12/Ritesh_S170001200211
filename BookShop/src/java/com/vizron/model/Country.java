/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ritesh
 */
@Entity
@Table(name = "COUNTRIES")
public class Country implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "COUNTRYNO")
    private Integer countryNo;
    @Column(name = "COUNTRY")
    @NotEmpty(message = "Country name is mandatry")
    private String country;

    /**
     * @return the countryNo
     */
    public Integer getCountryNo() {
        return countryNo;
    }

    /**
     * @param countryNo the countryNo to set
     */
    public void setCountryNo(Integer countryNo) {
        this.countryNo = countryNo;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    
}

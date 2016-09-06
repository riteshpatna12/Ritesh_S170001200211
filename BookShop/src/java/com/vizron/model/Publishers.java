/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ritesh
 */
@Entity
@Table(name="PUBLISHERS")
public class Publishers {
    @Id
    @GeneratedValue
    @Column(name="PUBLISHERNO")
    private Integer publisherNo;
    @Column(name="PUBLISHERNAME")
    @NotEmpty(message="Publisher name is Mandatory")
    private String publisherName;
    @Column(name="ADDRESS1")
    private String address1;
    @Column(name="ADDRESS2")
    private String address2;
    @Column(name="CITY")
    private String city;
    @Column(name="STATENO")
    private String stateNo;
    @Column(name="PINCODE")
    private String pincode;
    @Column(name="COUNTRYNO")
    private String countryNo;
    @Column(name="EMAILADDRESS")
    @NotEmpty(message="Email Address is mandatory")
    @Email(message="invalid email address")
    private String emailAddress;

    /**
     * @return the publisherNo
     */
    public Integer getPublisherNo() {
        return publisherNo;
    }

    /**
     * @param publisherNo the publisherNo to set
     */
    public void setPublisherNo(Integer publisherNo) {
        this.publisherNo = publisherNo;
    }

    /**
     * @return the publisherName
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * @param publisherName the publisherName to set
     */
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the stateNo
     */
    public String getStateNo() {
        return stateNo;
    }

    /**
     * @param stateNo the stateNo to set
     */
    public void setStateNo(String stateNo) {
        this.stateNo = stateNo;
    }

    /**
     * @return the pincode
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * @param pincode the pincode to set
     */
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    /**
     * @return the countryNo
     */
    public String getCountryNo() {
        return countryNo;
    }

    /**
     * @param countryNo the countryNo to set
     */
    public void setCountryNo(String countryNo) {
        this.countryNo = countryNo;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.model;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ritesh
 */
@Entity
@Table(name="AUTHORS")
public class Author implements java.io.Serializable{
    @Id
    @GeneratedValue
    @Column(name="AUTHORNO")
    private Integer authorNo;
    @Column(name="FIRSTNAME")
    @NotEmpty(message="First name is mandatory")
    private String firstName;
    @Column(name="LASTNAME")
    @NotEmpty(message="Last name is mandatory")
    private String lasttName;
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
    @Column(name="Degree")
    private String degree;
    @Column(name="EMAILADDRESS")
    @NotEmpty(message="Email Address is mandatory")
    @Email(message="invalid email address")
    private String emailAddress;
    @Column(name="PHOTOGRAPH")
    @Lob
    private Blob photograph;
    @Column(name="SPECIALITY")
    private String speciality;
    @Column(name="DOB")
    private String dob;

    /**
     * @return the authorNo
     */
    public Integer getAuthorNo() {
        return authorNo;
    }

    /**
     * @param authorNo the authorNo to set
     */
    public void setAuthorNo(Integer authorNo) {
        this.authorNo = authorNo;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lasttName
     */
    public String getLasttName() {
        return lasttName;
    }

    /**
     * @param lasttName the lasttName to set
     */
    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
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
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
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

    /**
     * @return the photograph
     */
    public Blob getPhotograph() {
        return photograph;
    }

    /**
     * @param photograph the photograph to set
     */
    public void setPhotograph(Blob photograph) {
        this.photograph = photograph;
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
    
    
    
    
    
    
    
    
}

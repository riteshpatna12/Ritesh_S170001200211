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
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ritesh
 */
@Entity
@Table(name="USERS")
public class User implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="USERNO")
    private Integer userNo;
    @Column(name="USERNAME")
    @NotEmpty(message="Username is mandatory")
    private String userName;
    @Column(name="PASSWORD")
    @NotEmpty(message="Password is mandatory")
    private String password;
    @Column(name="EMAILADDRESS")
    @NotEmpty(message="Email address is mandatory")
    @Email(message="Invalid email address")
    private String emailAddress;
    @Column(name="FIRSTNAME")
    @NotEmpty(message="Firstname is mandatory")
    private String firstName;
    @Column(name="LASTNAME")
    @NotEmpty(message="Lastname is mandatory")
    private String lastName;
    @Column(name="ADDRESS1")
    private String address1;
    @Column(name="ADDRESS2")
    private String address2;
    @Column(name="CITY")
    private String city;
    @Column(name="STATENO")
    private Integer stateNo;
    @Column(name="PINCODE")
    private String pincode;
    @Column(name="COUNTRYNO")
    private String countryNo;
    @Column(name="DOB")
    private String dob;
    @Column(name="NEWRELEASE")
    private String newRelease;
    @Column(name="BOOKUPDATES")
    private String bookUpdates;
    @Column(name="ENABLED")
    private String enabled;
    @Column(name="AUTHORITY")
    private String authority;

    /**
     * @return the userNo
     */
    public Integer getUserNo() {
        return userNo;
    }

    /**
     * @param userNo the userNo to set
     */
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public Integer getStateNo() {
        return stateNo;
    }

    /**
     * @param stateNo the stateNo to set
     */
    public void setStateNo(Integer stateNo) {
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

    /**
     * @return the newRelease
     */
    public String getNewRelease() {
        return newRelease;
    }

    /**
     * @param newRelease the newRelease to set
     */
    public void setNewRelease(String newRelease) {
        this.newRelease = newRelease;
    }

    /**
     * @return the bookUpdates
     */
    public String getBookUpdates() {
        return bookUpdates;
    }

    /**
     * @param bookUpdates the bookUpdates to set
     */
    public void setBookUpdates(String bookUpdates) {
        this.bookUpdates = bookUpdates;
    }

    /**
     * @return the enabled
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * @return the authority
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * @param authority the authority to set
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }
    
    
    
    
    
}

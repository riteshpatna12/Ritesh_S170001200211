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
@Table(name="STATE")
public class State implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="STATENO")
    private Integer stateNo;
    @Column(name="STATE")
    @NotEmpty(message="State name is mandatory")
    private String state;

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
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    
    
    
    
}

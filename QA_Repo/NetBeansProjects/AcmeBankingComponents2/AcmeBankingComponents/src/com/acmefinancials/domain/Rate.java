/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.domain;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Rate {

    private final String code;
    private final Date dateOfRate;
    private final double value;

    public Rate(String code, Date dateOfRate, double value) {
        this.value = value;
        this.code = code;
        this.dateOfRate = dateOfRate;
    }

    public Date getDate() {
        return dateOfRate;
    }

    public double getValue() {
        return value;
    }

    public String code() {
        return code;
    }
}

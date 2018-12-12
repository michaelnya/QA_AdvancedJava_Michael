/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.domain;

import com.acmefinancials.interfaces.ForexService;
import com.acmefinancials.interfaces.Printable;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Administrator
 */
public abstract class Account implements Printable {
    protected String name;
    protected int sortCode;
    protected int accountNumber;
    protected BigDecimal balance;
    protected ForexService service;
    
/**
 * 
 * @param name
 * @param sortCode
 * @param balance
 * @param accountNumber 
 */
    public Account(String name,int sortCode, BigDecimal balance,int accountNumber){
        this.accountNumber = accountNumber;
        this.name = name;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public void setForexService(ForexService service){
        this.service = service;
    }
    
    /**
     * 
     * @param account
     * @param amount 
     */
    public abstract void transfer(Account account,BigDecimal amount);
    /**
     * 
     * @return 
     */
    public abstract Balance checkBalance();    
    /**
     * 
     * @param amount 
     */
    public abstract void withdraw(BigDecimal amount);
    /**
     * 
     * @param amount 
     */
    public abstract void deposit(BigDecimal amount);

    public Balance checkBalance(double euroRate) {
        return new Balance(balance.multiply(new BigDecimal(Double.toString(euroRate))), this);         
    }        
}

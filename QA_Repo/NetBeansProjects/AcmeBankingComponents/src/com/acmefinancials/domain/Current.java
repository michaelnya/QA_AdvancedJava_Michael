/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author ArthurM
 */
public class Current extends Account {

    public Current(String name, int sortCode, BigDecimal checkBalance, int accountNumber) {
        super(name, sortCode, checkBalance, accountNumber);
    }

    @Override
    public void transfer(Account account, BigDecimal amount) {
      
        withdraw(amount);
        account.deposit(amount);

    }

    @Override
    public Balance checkBalance() {
        return new Balance(balance,this);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public void deposit(BigDecimal amount) {
        if(amount.intValue() <=0)
            throw new IllegalArgumentException("invalid deposit amount. Attempted to deposit amount" + amount.toPlainString());
            balance = balance.add(amount);
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

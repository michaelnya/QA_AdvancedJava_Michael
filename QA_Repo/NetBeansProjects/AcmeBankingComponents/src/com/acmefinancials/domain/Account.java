/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.domain;

import com.acmefinancials.interfaces.Printable;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author ArthurM
 */
public abstract class Account implements Printable {
    protected String name;
    protected int sortCode;
    protected int accountNumber;
    protected BigDecimal checkBalance;
    protected BigDecimal balance;
    
    public Account(String name, int sortCode, BigDecimal checkBalance, int accountNumber){
    this.accountNumber = accountNumber;
    this.checkBalance = checkBalance;
    this.name = name;
    this.sortCode = sortCode;
   
    }
    
   public abstract void transfer(Account account, BigDecimal amount);
   public abstract Balance checkBalance();
   public abstract void withdraw(BigDecimal amount);
   public abstract void deposit(BigDecimal amount);
}

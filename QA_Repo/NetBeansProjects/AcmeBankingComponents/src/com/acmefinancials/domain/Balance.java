/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.domain;
import com.acmefinancials.domain.Account;
import java.math.BigDecimal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ArthurM
 */
public class Balance {
    
   
    private final Account account;
    private final BigDecimal amount;    

    public Balance(BigDecimal amount, Account account){
        this.amount= amount;
        this.account= account;
    }
        
    public BigDecimal getAmount(){
        return amount;
    }
}

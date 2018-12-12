/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.domain;

import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class Balance {
    private final Account account;
    private final BigDecimal amount;

    public Balance(BigDecimal amount, Account account) {
        this.account = account;
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}

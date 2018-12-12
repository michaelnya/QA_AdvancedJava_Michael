/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.tests;

import com.acme.financials.exceptions.BankingException;
import com.acmefinancials.domain.Account;
import com.acmefinancials.domain.Balance;
import com.acmefinancials.domain.Current;
import com.acmefinancials.domain.Rate;
import com.acmefinancials.interfaces.ForexService;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Administrator
 */
public class CurrentAccountTest {

    private Account currentAccount;

    public CurrentAccountTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        String name = "John Doe";
        int sortCode = 602045;
        int accountNumber = 92446345;
        BigDecimal openingBalance = new BigDecimal(Double.toString(120.50));
        currentAccount = new Current(name, sortCode, openingBalance, accountNumber);
    }

    @After
    public void tearDown() {
        //System.out.println("I am running after");
    }

    @Test
    public void testDeposit() {
        //ARRANGE
        BigDecimal amountToDeposit = new BigDecimal(Double.toString(5.20));
        BigDecimal expectedBalance = new BigDecimal(Double.toString(125.70));

        //ACT 
        currentAccount.deposit(amountToDeposit);//UNIT
        Balance actualBalance = currentAccount.checkBalance();

        //ASSERT
        assertEquals(expectedBalance, actualBalance.getAmount());
    }

    @Test
    public void testWithdraw() {
        //ARRANGE
        BigDecimal amountToWithdraw = new BigDecimal(Double.toString(5.20));
        BigDecimal expectedBalance = new BigDecimal(Double.toString(115.30));

        //ACT 
        currentAccount.withdraw(amountToWithdraw);//UNIT
        Balance actualBalance = currentAccount.checkBalance();

        //ASSERT
        assertEquals(expectedBalance, actualBalance.getAmount());
    }

    @Test()
    public void testTransfer() {
        //ARRANGE
        BigDecimal amountToTransfer = new BigDecimal(Double.toString(5.20));
        Account beneficiaryAccount = new Current("Anne Doe", 000000, new BigDecimal(Double.toString(12.50)), 12345678);

        //ACT 
        currentAccount.transfer(beneficiaryAccount, amountToTransfer);//UNIT

        //ASSERT
        BigDecimal acutalBeneficiaryBalance = beneficiaryAccount.checkBalance().getAmount();
        BigDecimal expectedBeneficiaryBalance = new BigDecimal(Double.toString(17.70));
        assertEquals(expectedBeneficiaryBalance, acutalBeneficiaryBalance);
    }

    @Test
    public void testGetBalanceAsEuro() {
        //Arrange
        ForexService fakeForexService = new FakeForexService();
        //1.11 - EURO/GBP
        BigDecimal expectedEuroBalance  =  new BigDecimal(Double.toString(133.755));
        double euroRate = fakeForexService.getRateByCode("EUR");

        //Act
        Balance actualBalanceEuro = currentAccount.checkBalance(euroRate);
        assertEquals(expectedEuroBalance, actualBalanceEuro.getAmount());
    }

    @Ignore
    @Test(expected = BankingException.class)
    public void shouldThrowExceptionWhenDepositIsLessThanZero() {
        BigDecimal amountToDeposit = new BigDecimal(Double.toString(-5.20));
        currentAccount.deposit(amountToDeposit);
    }
}

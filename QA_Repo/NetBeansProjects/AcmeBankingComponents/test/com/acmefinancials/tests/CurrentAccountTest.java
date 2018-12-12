/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.tests;

import com.acmefinancials.domain.Account;
import com.acmefinancials.domain.Balance;
import com.acmefinancials.domain.Current;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ArthurM
 */
public class CurrentAccountTest {

   
    Account currentAccount;

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
        BigDecimal amountToDeposit = new BigDecimal(5.20);
        String name = "Jonny Doe";
        int sortCode = 548943;
        int accountNumber = 43345445;
        BigDecimal openingBalance = new BigDecimal(120.50);
                 currentAccount = new Current(name, sortCode, openingBalance, accountNumber);


    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void testDeposit() {
        //Arrange, Act Assert

        //Arrange
      
        BigDecimal expectedBalance = new BigDecimal("125.70");


        //ACT Methods
        currentAccount.deposit(new BigDecimal("5.20"));
        Balance actualBalance = currentAccount.checkBalance();

        //Assert
        assertEquals(expectedBalance, actualBalance.getAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifDepositIsLessThanZero_ThenThrowException() {
        // Arrange
        BigDecimal amountToDeposit = new BigDecimal(-5.20);
        String name = "Jonny Doe";
        int sortCode = 548943;
        int accountNumber = 43345445;
        BigDecimal openingBalance = new BigDecimal(120.50);
        BigDecimal expectedBalance = openingBalance.add(amountToDeposit);

        Account currentAccount = new Current(name, sortCode, openingBalance, accountNumber);

        currentAccount.deposit(amountToDeposit);

    }

    @Test
    public void transferWhenitry() {
        BigDecimal amountToTransfer = new BigDecimal(5.20);
        Account beneficiaryAccount = new Current("anne Doe", 000000, new BigDecimal("12.50"), 12233456);

        //ACT//
        currentAccount.transfer(beneficiaryAccount, amountToTransfer);

        //ASSERT
        BigDecimal actualBeneficiaryBalance = new BigDecimal("12.70");
        assertEquals(expectedBeneficiaryBalance, actualBeneficiaryBalance);
    }
}

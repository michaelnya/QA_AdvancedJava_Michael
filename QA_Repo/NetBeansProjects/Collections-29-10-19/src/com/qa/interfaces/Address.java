/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.interfaces;

/**
 *
 * @author Administrator
 */
public class Address implements Printable{
    private String firstLine;
    private String secondLine;
    private String postCode;
    
    public Address(String firstLine, String secondLine, String postCode){
    this.firstLine = firstLine;
    this.secondLine = secondLine;
    this.postCode = postCode;
    }

    @Override
    public void print() {
        System.out.println("ete");
    }
}

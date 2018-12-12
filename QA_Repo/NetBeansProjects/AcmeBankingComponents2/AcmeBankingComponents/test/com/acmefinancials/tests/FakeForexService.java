/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acmefinancials.tests;

import com.acmefinancials.domain.Rate;
import com.acmefinancials.interfaces.ForexService;
import java.util.Date;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Administrator
 */
public class FakeForexService implements ForexService {

    public FakeForexService() {
    }

    private Dictionary<String,Rate> getRateData(){
        Dictionary<String,Rate> myRates  = new Hashtable<>();
        myRates.put("USD", new Rate("USD",new Date(),1.26));
        myRates.put("EUR", new Rate("EUR",new Date(),1.11));
        myRates.put("JPY", new Rate("JPY",new Date(),142.44));
        myRates.put("AUD", new Rate("AUD",new Date(),1.74));   
        myRates.put("GBP", new Rate("GBP",new Date(),1.00));        
        return myRates;
    }
    
    @Override
    public double getRateByCode(String code) {
        return getRateData().get(code).getValue();
    }

    @Override
    public Dictionary<String, Rate> getRates(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

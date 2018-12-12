/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qasupermarketcomponents.Data;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import qasupermarketcomponents.model.Product;

/**
 *
 * @author ArthurM
 */
public class SupermarketDataHarness {

    private static Product beans;
    private static Product cornflakes;
      public static void add (Product product) {
	//You will need to expand this example to get 
        //A BOGOF Offer
        Offer bogofOffer = new Offer();
        bogofOffer.setOfferId(1);
        bogofOffer.setBOGOF(true);
        bogofOffer.setOfferDescription("Buy one get one free");
        bogofOffer.setShortDescription("BOGOF");
        //TODO add all the other offers here

        //A product with a BOGOF offer
        Product beans = new Product();
        beans.setId(1);
        beans.productName("Baked Beans");
        beans.setPrice(0.56);
        beans.setOffer(bogofOffer);

        Product cornflakes = new Product();
        cornflakes.setId(2);
        cornflakes.productName("Corn Flakes");
        cornflakes.setPrice(2.22);
        cornflakes.setOffer(null);
      
        
        //TODO add all the other products here
      }
      
    public static String add() {
                //This dictionary will store all our products and their offers. We will use it as our in-memory database
        Dictionary<Integer, Product> allProductsAndOffer = new Hashtable<>();
        allProductsAndOffer.put(1, beans);
        allProductsAndOffer.put(2, cornflakes);
        
         //I have added beans  to the basket
        List<Product> basket = new ArrayList<>();
        basket.add(allProductsAndOffer.get(1));
        return null;
    }
}
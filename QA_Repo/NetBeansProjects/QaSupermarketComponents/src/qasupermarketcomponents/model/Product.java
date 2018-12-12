 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qasupermarketcomponents.model;

import qasupermarketcomponents.Data.Offer;

/**
 *
 * @author ArthurM
 */
public class Product {
    private int id;
    private  String productName;
    private  double price;
    private Offer offer;

    public Product() {
       
    }
   
    public Offer getOffers(){
        return offer;
    }
    
    public void setOffer(Offer offer){
        this.offer = offer;
    }
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void productName(String name) {
        this.productName = productName;
    }
    
    public Product(String productName, double price){
        this.setId(0);
        this.productName = productName;
        this.price = price;
        this.setOffer(offer);
    }
     
    public String getProductName() {
        return productName;
    }
    
        public String setProductName() {
        return productName;
    }
       
    @Override
    public String toString(){
    return "Product Name: "+ productName + " Price: £" + price; 
    }   
}
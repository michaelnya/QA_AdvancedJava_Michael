/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qasupermarketcomponents.Data;

/**
 *
 * @author ArthurM
 */
public class Product2 {
    private int id;
    private String name;
    private double price;
    private Offer offer;
    
    public Offer getOffers(){
        return offer;
    }
    
    public void setOffer(Offer offer){
        this.offer = offer;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
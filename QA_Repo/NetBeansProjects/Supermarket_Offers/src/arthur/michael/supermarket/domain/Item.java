/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur.michael.supermarket.domain;

/**
 *
 * @author Administrator
 */
public class Item {
//fields
private String name;
private long id;
private double price;

//constructor
public Item(String name, long id, double price){
    this.name = name;
    this.id = id;
    this.price = price;
    }

//getter / accessor 
    public double getPrice(){
        return price;
    }
    public long getId(){
        return id;
    }
    public void setPrice(double price){
        this.price = price;
    }
}

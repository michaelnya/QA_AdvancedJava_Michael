/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.events.management.model;

/**
 *
 * @author Administrator
 */
public class Speaker {

    private final String name;
    private final String contactNumber;
    private final double rate;
    private int id;
    
    public Speaker(String name,  String contactNumber, double rate) {

        this.contactNumber = contactNumber;
        this.rate = rate;
        this.name = name;
    }
    
    public Speaker(String name, int id, String contactNumber, double rate) {
        this.id = id;
        this.contactNumber = contactNumber;
        this.rate = rate;
        this.name = name;
    }
    

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public double getRate() {
        return rate;
    }
    
    public int getId(){
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nContact Number: " + contactNumber + "\nRate: " + rate + "Id: \n" + id + "\n";
    }
}
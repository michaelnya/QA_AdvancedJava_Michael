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
  //  private final int id;
   // public String getId;
    
    public Speaker(String name, String contactNumber, double rate/*, int id*/) {
        this.contactNumber = contactNumber;
        this.rate = rate;
        this.name = name;
    //    this.id = id;
    }

    public Speaker(String Name, double Rate, String Contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
  /*  public int getId()  {
    return id;
    }*/
    
    @Override
    public String toString(){
    return "Name: "+ name + "Rate: " + rate + "Contact Number: "+ contactNumber /*+ "Id:: " + id*/; 
    }
}
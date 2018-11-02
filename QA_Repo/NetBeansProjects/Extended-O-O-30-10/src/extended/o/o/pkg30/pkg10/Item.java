/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extended.o.o.pkg30.pkg10;

import sun.security.jca.GetInstance;

/**
 *
 * @author Administrator
 */
public class Item {
 
    private String name;
    public Item(){
    
    }
    
    public static Item getInstance(){
    return new Item();
    }
    
    public final void setName(String name){
        this.name = name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur.michael.supermarket.domain;

import java.util.HashMap;

/**
 *
 * @author Administrator
 */
public class ShoppingBasket {
    HashMap<Integer, Item> myBasket = new HashMap<>();
    
    /**
     *
     * @param item
     */
    public void addItem(Item item){
        myBasket.put(item.getId(), item);
    }
}

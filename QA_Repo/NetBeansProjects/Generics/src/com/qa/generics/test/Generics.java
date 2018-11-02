/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.generics.test;

/**
 *
 * @author Administrator
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        print(new Integer[]{2,3,4,5});
        print(new String[]{"","",""});

        Box<Integer> myBox = new Box<>(2);
        int x = myBox.get();
        myBox.set(5);
    }

public static <T> void print (T[] items){
    for (int i = 0; i < 10; i++){
    }
  }  
}

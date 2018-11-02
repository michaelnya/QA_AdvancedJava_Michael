/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals.michael;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FundamentalsMichael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = myScanner.nextInt();
        
//        checkNumber(a);
        try {
            double x = 5 + ArithmeticCalculator.divide(0, 0);
            System.out.println(x);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        ArithmeticCalculator calc = new ArithmeticCalculator(10, 12);
        double answer = calc.add();
        
 //       System.out.println(answer);
        
 //       short x =(short) ArithmeticCalculator.add(10, 5); //casting
                
    }
    private static void checkNumber(int a){     
    if (a%2 == 0) {
            System.out.println("Even");
        }
        else   {
        System.out.println("Odd");
        }
    }
}
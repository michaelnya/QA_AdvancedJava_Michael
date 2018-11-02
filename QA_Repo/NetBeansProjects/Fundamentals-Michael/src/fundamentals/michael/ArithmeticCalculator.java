/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals.michael;

/**
 *
 * @author Administrator
 */
public class ArithmeticCalculator {
    private double x;
    private double y;
    
    public ArithmeticCalculator(double x, double y){
    this.x = x;
    this.y = y;
   }
    
    public double add(){
    return x+y;
    
    }
    public static int add(int x, int y) {
    return x +y;
    }
    
//    public static int divide(int x, int y){
//        return x/y;
//    }
        public static int divide(int x, int y) {
        if(x==0)
            throw new IllegalArgumentException("Division by zero");
            return x/y;
    }
        public int subtract(int x, int y){
        return x-y;
    }
        public static int multiply(int x, int y){
        return x*y;
    }
}

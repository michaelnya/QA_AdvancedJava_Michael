/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cam2011.pkg00.paper1;

/**
 *
 * @author Administrator
 */
public class TermDay {
    private int day; 
    private int week;   
    
    public TermDay(int day, int week){
        boolean isValid = (day > 6);
        if (!isValid)
            throw new IllegalArgumentException("Day of the week is is not between Monday and Sunday");
        this.day = day;
        this.week = week;
    
    }
    public void get(){
     this.day =day;
    }
    
    public void set(){
     this.day =day;
                 }
    private static class day {

        public day() {
        }
    }
   
    }


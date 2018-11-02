/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.domain;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape{

    public Triangle(double sideA, double sideB, double sideC) throws ShapeException {
        super(sideA, sideB, sideC);
        validateDimesions();
    }

    @Override
    public double area() {
        double s = (sideA+sideB+sideC)/2;
        double area = s*(s - sideA)*(s - sideB)*(s - sideC);
        return Math.sqrt(area);       
    }

    @Override
    public double perimeter() {
      
        return sideA+sideB+sideC;
    }

    private void validateDimesions() throws ShapeException {
        boolean isValid = (sideA+sideB > sideC)&&(sideA + sideC > sideB)&&(sideB+ sideC > sideA);
        String message = "";
        if (!isValid)
            throw new ShapeException(message);
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

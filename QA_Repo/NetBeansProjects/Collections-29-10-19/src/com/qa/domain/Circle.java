/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.domain;

import java.time.LocalDateTime;

/**
 *
 * @author Administrator
 */
public class Circle extends Object {

    private double radius;
    private LocalDateTime dateCreated;
    private final Coordinate coordinate;
    
    public Circle(double radius, Coordinate coordinate) {
        this.radius = radius;
        dateCreated = LocalDateTime.now();
        this.coordinate = coordinate;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double parameter () {
    return Math.PI*2* radius;
    }
    //@override
    public String toString() {
       return "The circle has a radius" +radius + " .It was created on" + dateCreated + " .Area is" + area();
    }
    }


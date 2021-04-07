/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.group31adp2;

/**
 *
 * @author asemahle Ndlwana
 */

public class Vehicle {
   private String car;
   private int number;
   private String color;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "car=" + car + ", number=" + number + ", color=" + color + '}';
    }
    
   
    
}

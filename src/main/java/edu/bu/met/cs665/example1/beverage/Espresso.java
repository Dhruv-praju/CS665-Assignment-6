/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: Espresso.java
 * Description: This class represents a type of coffee beverage called Espresso.
 */

 package edu.bu.met.cs665.example1.beverage;

 import edu.bu.met.cs665.example1.Beverage;
 
 /**
  * This class represents a type of coffee beverage called Espresso.
  */
 public class Espresso extends Beverage {
 
     /**
      * Constructs a new Espresso object.
      */
     public Espresso() {
         this.description = "Espresso";
     }
 
     /**
      * Calculates the price of the Espresso beverage.
      *
      * @return The base price of the Espresso beverage.
      */
     @Override
     public float calculatePrice() {
         return this.baseprice;
     }
 }
 
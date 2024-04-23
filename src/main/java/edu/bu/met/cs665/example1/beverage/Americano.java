/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: Americano.java
 * Description: This class represents a type of coffee beverage called Americano.
 */

 package edu.bu.met.cs665.example1.beverage;

 import edu.bu.met.cs665.example1.Beverage;
 
 /**
  * This class represents a type of coffee beverage called Americano.
  */
 public class Americano extends Beverage {
 
     /**
      * Constructs a new Americano object.
      */
     public Americano() {
         this.description = "Americano";
     }
 
     /**
      * Calculates the price of the Americano beverage.
      *
      * @return The base price of the Americano beverage.
      */
     @Override
     public float calculatePrice() {
         return this.baseprice;
     }
 }
 
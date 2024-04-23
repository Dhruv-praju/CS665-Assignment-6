/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: Latte.java
 * Description: This class represents a type of coffee beverage called Latte.
 */

 package edu.bu.met.cs665.example1.beverage;

 import edu.bu.met.cs665.example1.Beverage;
 
 /**
  * This class represents a type of coffee beverage called Latte.
  */
 public class Latte extends Beverage {
 
     /**
      * Constructs a new Latte object.
      */
     public Latte() {
         this.description = "Latte";
     }
 
     /**
      * Calculates the price of the Latte beverage.
      *
      * @return The base price of the Latte beverage.
      */
     @Override
     public float calculatePrice() {
         return this.baseprice;
     }
 }
 
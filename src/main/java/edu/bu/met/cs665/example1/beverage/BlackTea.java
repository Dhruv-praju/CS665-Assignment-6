/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: BlackTea.java
 * Description: This class represents a type of tea beverage called Black Tea.
 */

 package edu.bu.met.cs665.example1.beverage;

 import edu.bu.met.cs665.example1.Beverage;
 
 /**
  * This class represents a type of tea beverage called Black Tea.
  */
 public class BlackTea extends Beverage {
 
     /**
      * Constructs a new BlackTea object.
      */
     public BlackTea() {
         this.description = "Black Tea";
     }
 
     /**
      * Calculates the price of the BlackTea beverage.
      *
      * @return The base price of the BlackTea beverage.
      */
     @Override
     public float calculatePrice() {
         return this.baseprice;
     }
 }
 
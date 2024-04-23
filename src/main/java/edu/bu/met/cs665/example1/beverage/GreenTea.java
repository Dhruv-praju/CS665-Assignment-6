/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: GreenTea.java
 * Description: This class represents a type of tea beverage called Green Tea.
 */

 package edu.bu.met.cs665.example1.beverage;

 import edu.bu.met.cs665.example1.Beverage;
 
 /**
  * This class represents a type of tea beverage called Green Tea.
  */
 public class GreenTea extends Beverage {
 
     /**
      * Constructs a new GreenTea object.
      */
     public GreenTea() {
         this.description = "Green Tea";
     }
 
     /**
      * Calculates the price of the GreenTea beverage.
      *
      * @return The base price of the GreenTea beverage.
      */
     @Override
     public float calculatePrice() {
         return this.baseprice;
     }
 }
 
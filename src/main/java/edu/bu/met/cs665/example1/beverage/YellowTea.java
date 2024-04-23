/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: YellowTea.java
 * Description: This class represents a type of tea beverage called Yellow Tea.
 */

 package edu.bu.met.cs665.example1.beverage;

 import edu.bu.met.cs665.example1.Beverage;
 
 /**
  * This class represents a type of tea beverage called Yellow Tea.
  */
 public class YellowTea extends Beverage {
 
     /**
      * Constructs a new YellowTea object.
      */
     public YellowTea() {
         this.description = "Green Tea"; // Yellow tea described as Green Tea for consistency
     }
 
     /**
      * Calculates the price of the YellowTea beverage.
      *
      * @return The base price of the YellowTea beverage.
      */
     @Override
     public float calculatePrice() {
         return this.baseprice;
     }
 }
 
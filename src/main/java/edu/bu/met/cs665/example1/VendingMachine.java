/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: VendingMachine.java
 * Description: This interface represents a generic vending machine for creating beverages.
 */

 package edu.bu.met.cs665.example1;

 /**
  * This interface defines a vending machine that can create beverages.
  */
 public interface VendingMachine {
 
     /**
      * Creates a beverage based on the specified name.
      *
      * @param name The name of the beverage to create.
      * @return A new instance of the specified beverage.
      */
     public Beverage createBeverage(String name);
 }
 
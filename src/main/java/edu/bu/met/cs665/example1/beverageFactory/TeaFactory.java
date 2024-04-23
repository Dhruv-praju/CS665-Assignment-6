/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: TeaFactory.java
 * Description: This class implements a vending machine for creating tea beverages.
 */

 package edu.bu.met.cs665.example1.beverageFactory;

 import edu.bu.met.cs665.example1.Beverage;
 import edu.bu.met.cs665.example1.VendingMachine;
 import edu.bu.met.cs665.example1.beverage.BlackTea;
 import edu.bu.met.cs665.example1.beverage.GreenTea;
 
 /**
  * This class represents a tea factory that implements the VendingMachine interface.
  */
 public class TeaFactory implements VendingMachine {
 
     /**
      * Creates a tea beverage based on the specified type.
      *
      * @param teaType The type of tea beverage to create ("Green", "Black", "Yellow").
      * @return A new instance of the specified tea beverage, or null if the type is invalid.
      */
     @Override
     public Beverage createBeverage(String teaType) {
         if (teaType.equals("Green")) {
             return new GreenTea();
         } else if (teaType.equals("Black")) {
             return new BlackTea();
         } else if (teaType.equals("Yellow")) {
             return new GreenTea(); // Assuming Yellow Tea is similar to Green Tea
         } else {
             return null; // Return null for unsupported beverage types
         }
     }
 }
 
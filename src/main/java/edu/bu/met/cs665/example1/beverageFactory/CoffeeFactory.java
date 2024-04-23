/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: CoffeeFactory.java
 * Description: This class implements a vending machine for creating coffee beverages.
 */

 package edu.bu.met.cs665.example1.beverageFactory;

 import edu.bu.met.cs665.example1.Beverage;
 import edu.bu.met.cs665.example1.VendingMachine;
 import edu.bu.met.cs665.example1.beverage.Americano;
 import edu.bu.met.cs665.example1.beverage.Espresso;
 import edu.bu.met.cs665.example1.beverage.Latte;
 
 /**
  * This class represents a coffee factory that implements the VendingMachine interface.
  */
 public class CoffeeFactory implements VendingMachine {
 
     /**
      * Creates a coffee beverage based on the specified type.
      *
      * @param CoffeeType The type of coffee beverage to create ("Latte", "Americano", "Expresso").
      * @return A new instance of the specified coffee beverage, or null if the type is invalid.
      */
     @Override
     public Beverage createBeverage(String CoffeeType) {
         if (CoffeeType.equals("Latte")) {
             return new Latte();
         } else if (CoffeeType.equals("Americano")) {
             return new Americano();
         } else if (CoffeeType.equals("Espresso")) {
             return new Espresso();
         } else {
             return null; // Return null for unsupported beverage types
         }
     }
 }
 
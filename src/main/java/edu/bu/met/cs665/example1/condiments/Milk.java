/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: Milk.java
 * Description: This class represents a milk condiment that can be added to a beverage.
 */

 package edu.bu.met.cs665.example1.condiments;

 import edu.bu.met.cs665.example1.Beverage;
 import edu.bu.met.cs665.example1.CondimentDecorator;
 
 /**
  * This class represents a milk condiment that can be added to a beverage.
  */
 public class Milk extends CondimentDecorator {
 
     /**
      * Constructs a new Milk object with the specified beverage and quantity of milk.
      *
      * @param beverage The beverage to decorate with milk.
      * @param quantity The quantity of milk to add.
      */
     public Milk(Beverage beverage, int quantity) {
         this.beverage = beverage;
         this.quantity = Math.min(quantity, this.maxQty);
     }
 
     /**
      * Returns the description of the decorated beverage with added milk.
      *
      * @return The description of the beverage with milk.
      */
     @Override
     public String getDescription() {
         return beverage.getDescription() + ", Milk";
     }
 
     /**
      * Calculates the price of the beverage with added milk.
      *
      * @return The total price of the beverage with milk.
      */
     @Override
     public float calculatePrice() {
         return beverage.calculatePrice() + this.quantity * this.price;
     }
 }
 
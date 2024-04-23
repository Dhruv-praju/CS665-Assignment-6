/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: Sugar.java
 * Description: This class represents a sugar condiment that can be added to a beverage.
 */

 package edu.bu.met.cs665.example1.condiments;

 import edu.bu.met.cs665.example1.Beverage;
 import edu.bu.met.cs665.example1.CondimentDecorator;
 
 /**
  * This class represents a sugar condiment that can be added to a beverage.
  */
 public class Sugar extends CondimentDecorator {
 
     /**
      * Constructs a new Sugar object with the specified beverage and quantity of sugar.
      *
      * @param beverage The beverage to decorate with sugar.
      * @param quantity The quantity of sugar to add.
      */
     public Sugar(Beverage beverage, int quantity) {
         this.beverage = beverage;
         this.quantity = Math.min(quantity, this.maxQty);
     }
 
     /**
      * Returns the description of the decorated beverage with added sugar.
      *
      * @return The description of the beverage with sugar.
      */
     @Override
     public String getDescription() {
         return beverage.getDescription() + ", Sugar";
     }
 
     /**
      * Calculates the price of the beverage with added sugar.
      *
      * @return The total price of the beverage with sugar.
      */
     @Override
     public float calculatePrice() {
         return beverage.calculatePrice() + this.quantity * this.price;
     }
 }
 
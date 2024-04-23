/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: CondimentDecorator.java
 * Description: This abstract class represents a decorator for adding condiments to beverages.
 */

 package edu.bu.met.cs665.example1;

 /**
  * This abstract class extends Beverage and serves as a decorator for adding condiments to beverages.
  */
 public abstract class CondimentDecorator extends Beverage {
     protected Beverage beverage;
     protected int quantity;
     protected int maxQty = 3;
     protected float price = 0.5f;
 
     /**
      * Returns the description of the decorated beverage.
      *
      * @return The description of the decorated beverage.
      */
     public abstract String getDescription();
 
     /**
      * Sets the maximum quantity of this condiment that can be added.
      *
      * @param maxQty The maximum quantity of the condiment.
      */
     public void setMaxQty(int maxQty) {
         this.maxQty = maxQty;
     }
 
     /**
      * Sets the price of this condiment.
      *
      * @param price The price of the condiment.
      */
     public void setPrice(float price) {
         this.price = price;
     }
 }
 
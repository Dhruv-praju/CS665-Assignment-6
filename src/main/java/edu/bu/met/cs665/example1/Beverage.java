/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: Beverage.java
 * Description: This abstract class represents a base beverage in a vending machine.
 */
package edu.bu.met.cs665.example1;
/**
 * This abstract class represents a base beverage in a vending machine.
 */
public abstract class Beverage {
   protected String description = "Unknown Beverage";
   protected float baseprice=2f;
    /**
     * Calculates the price of the beverage.
     *
     * @return The price of the beverage.
     */
   public abstract float calculatePrice();
    /**
     * Returns the description of the beverage.
     *
     * @return The description of the beverage.
     */
   public String getDescription() {
       return this.description;
   }
   /**
     * Sets the base price of the beverage.
     *
     * @param baseprice The base price of the beverage.
     */
   public void setBaseprice(float baseprice) {
       this.baseprice = baseprice;
   }
}

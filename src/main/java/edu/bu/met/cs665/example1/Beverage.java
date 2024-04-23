package edu.bu.met.cs665.example1;

public abstract class Beverage {
   protected String description = "Unknown Beverage";
   protected float baseprice=2f;

   public abstract float calcualtePrice();

   public String getDescription() {
       return this.description;
   }
   public void setBaseprice(float baseprice) {
       this.baseprice = baseprice;
   }
}

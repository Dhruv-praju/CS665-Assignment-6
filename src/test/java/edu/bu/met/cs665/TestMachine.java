/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: TestMachine.java
 * Description: This class contains JUnit tests for the VendingMachine and beverage-related classes.
 */

 package edu.bu.met.cs665;

 import static org.junit.Assert.assertEquals;
 
 import org.junit.Test;
 
 import edu.bu.met.cs665.example1.Beverage;
 import edu.bu.met.cs665.example1.VendingMachine;
 import edu.bu.met.cs665.example1.beverageFactory.CoffeeFactory;
 import edu.bu.met.cs665.example1.beverageFactory.TeaFactory;
 import edu.bu.met.cs665.example1.condiments.Milk;
 import edu.bu.met.cs665.example1.condiments.Sugar;
 
 /**
  * This class contains JUnit tests for the VendingMachine and beverage-related classes.
  */
 public class TestMachine {
 
     /**
      * Tests creating beverages using CoffeeFactory and TeaFactory.
      */
     @Test
     public void testMakingBeverage() {
         VendingMachine coffeeFactory = new CoffeeFactory();
         Beverage myEspresso = coffeeFactory.createBeverage("Espresso");
         System.out.println(myEspresso.getDescription());
 
         VendingMachine teaFactory = new TeaFactory();
         Beverage blackTea = teaFactory.createBeverage("Black");
         System.out.println(blackTea.getDescription());
     }
 
     /**
      * Tests adding condiments (Sugar and Milk) to a beverage.
      */
     @Test
     public void testAddingCondimentsToBeverage() {
         VendingMachine teaFactory = new TeaFactory();
         Beverage greenTea = teaFactory.createBeverage("Green");
 
         greenTea = new Sugar(greenTea, 2);
         greenTea = new Milk(greenTea, 1);
         System.out.println(greenTea.getDescription());
     }
 
     /**
      * Tests calculating the total price of a beverage with added Milk.
      */
     @Test
     public void testBeverageTotalPrice() {
         VendingMachine coffeeFactory = new CoffeeFactory();
         Beverage latte = coffeeFactory.createBeverage("Latte");
 
         latte = new Milk(latte, 2);
         System.out.println(latte.getDescription() + " with total price of " + latte.calculatePrice() + "$");
     }
 
     /**
      * Tests adding more than the allowed limit of Sugar to a beverage.
      */
     @Test
     public void testAddAboveLimitCondiments() {
         VendingMachine coffeeFactory = new CoffeeFactory();
         Beverage myAmericano = coffeeFactory.createBeverage("Americano");
 
         myAmericano = new Sugar(myAmericano, 5);
         System.out.println(myAmericano.getDescription() + " with total price of " + myAmericano.calculatePrice() + "$");
     }
 
 }
 
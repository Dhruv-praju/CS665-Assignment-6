/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 22/04/2024
 * File Name: Main.java
 * Description: This class contains the main method to demonstrate the usage of beverage vending machines.
 */

 package edu.bu.met.cs665;

 import edu.bu.met.cs665.example1.Beverage;
 import edu.bu.met.cs665.example1.VendingMachine;
 import edu.bu.met.cs665.example1.beverageFactory.CoffeeFactory;
 import edu.bu.met.cs665.example1.beverageFactory.TeaFactory;
 import edu.bu.met.cs665.example1.condiments.Milk;
 import edu.bu.met.cs665.example1.condiments.Sugar;
 
 /**
  * This class contains the main method to demonstrate the usage of beverage vending machines.
  */
 public class Main {
 
     public static void main(String[] args) {
         // Create a tea beverage (Green Tea) and add sugar and milk
         VendingMachine teaFactory = new TeaFactory();
         Beverage greenTea = teaFactory.createBeverage("Green");
 
         greenTea = new Sugar(greenTea, 4);
         greenTea = new Milk(greenTea, 5);
 
         System.out.println(greenTea.getDescription());
         System.out.println(greenTea.calculatePrice());
 
         // Create a coffee beverage (Latte)
         VendingMachine coffeeFactory = new CoffeeFactory();
         Beverage latte = coffeeFactory.createBeverage("Latte");
 
         System.out.println(latte.getDescription());
         System.out.println(latte.calculatePrice());
     }
 
 }
 
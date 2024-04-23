/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Beverage;
import edu.bu.met.cs665.example1.VendingMachine;
import edu.bu.met.cs665.example1.beverageFactory.CoffeeFactory;
import edu.bu.met.cs665.example1.beverageFactory.TeaFactory;
import edu.bu.met.cs665.example1.condiments.Milk;
import edu.bu.met.cs665.example1.condiments.Sugar;

/**
 * This is the Main class.
 */
public class Main {

  public static void main(String[] args) {
    VendingMachine teaFactory = new TeaFactory();
    Beverage greenTea = teaFactory.createBeverage("Green");

    greenTea = new Sugar(greenTea, 4);
    greenTea = new Milk(greenTea, 5);

    System.out.println(greenTea.getDescription());
    System.out.println(greenTea.calcualtePrice());

    VendingMachine coffeeFactory = new CoffeeFactory();
    Beverage latte = coffeeFactory.createBeverage("Latte");

    System.out.println(latte.getDescription());
    System.out.println(latte.calcualtePrice());
  }


}

package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.example1.Beverage;
import edu.bu.met.cs665.example1.VendingMachine;
import edu.bu.met.cs665.example1.beverageFactory.CoffeeFactory;
import edu.bu.met.cs665.example1.beverageFactory.TeaFactory;
import edu.bu.met.cs665.example1.condiments.Milk;
import edu.bu.met.cs665.example1.condiments.Sugar;

public class TestMachine {
    public TestMachine(){

    }

    @Test
    public void testMakingBeverage(){
        VendingMachine coffeeFactory = new CoffeeFactory();
        Beverage myExpresso = coffeeFactory.createBeverage("Expresso");
        System.out.println(myExpresso.getDescription());

        VendingMachine teaFactory = new TeaFactory();
        Beverage blackTea = teaFactory.createBeverage("Black");
        System.out.println(blackTea.getDescription());
    }

    @Test
    public void testAddingCondimentsToBeverage(){
        VendingMachine teaFactory = new TeaFactory();
        Beverage greenTea = teaFactory.createBeverage("Green");

        greenTea = new Sugar(greenTea, 2);
        greenTea = new Milk(greenTea, 1);
        System.out.println(greenTea.getDescription());
    }

    @Test
    public void testBeverageTotalPrice(){
        VendingMachine coffeeFactory = new CoffeeFactory();
        Beverage latte = coffeeFactory.createBeverage("Latte");

        latte = new Milk(latte, 2);
        System.out.println(latte.getDescription()+" with total price of "+latte.calcualtePrice()+"$");
    }

    @Test
    public void testAddAboveLimitCondiments(){
        VendingMachine coffeeFactory = new CoffeeFactory();
        Beverage myAmericano = coffeeFactory.createBeverage("Americano");

        myAmericano = new Sugar(myAmericano, 5);
        System.out.println(myAmericano.getDescription()+" with total price of "+myAmericano.calcualtePrice()+"$");
    }

}

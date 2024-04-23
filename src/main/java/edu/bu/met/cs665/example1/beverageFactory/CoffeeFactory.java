package edu.bu.met.cs665.example1.beverageFactory;

import edu.bu.met.cs665.example1.Beverage;
import edu.bu.met.cs665.example1.VendingMachine;
import edu.bu.met.cs665.example1.beverage.Americano;
import edu.bu.met.cs665.example1.beverage.Expresso;
import edu.bu.met.cs665.example1.beverage.Latte;

public class CoffeeFactory implements VendingMachine{

    @Override
    public Beverage createBeverage(String CoffeeType) {
        
         if (CoffeeType.equals("Latte")) {
            return new Latte();
        } else if(CoffeeType.equals("Americano")){
            return new Americano();
        } else if(CoffeeType.equals("Expresso")){
            return new Expresso();
        } else {
            return null;
        }
    }
}

package edu.bu.met.cs665.example1.condiments;

import edu.bu.met.cs665.example1.Beverage;
import edu.bu.met.cs665.example1.CondimentDecorator;

public class Milk extends CondimentDecorator{    

    public Milk(Beverage beverage, int quantity){
        this.beverage = beverage;
        this.quantity = Math.min(quantity, this.maxQty);
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription()+",Milk";
    }
    @Override
    public float calcualtePrice() {
        // TODO Auto-generated method stub
        return beverage.calcualtePrice() + this.quantity*this.price;
    }
}

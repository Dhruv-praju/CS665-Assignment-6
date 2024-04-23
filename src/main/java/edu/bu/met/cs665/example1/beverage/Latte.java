package edu.bu.met.cs665.example1.beverage;

import edu.bu.met.cs665.example1.Beverage;

public class Latte extends Beverage{

    public Latte(){
        this.description = "Latte";
    }
    @Override
    public float calcualtePrice() {
        // TODO Auto-generated method stub
        return this.baseprice;
    }
}

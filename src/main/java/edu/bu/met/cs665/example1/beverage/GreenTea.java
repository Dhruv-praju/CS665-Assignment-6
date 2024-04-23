package edu.bu.met.cs665.example1.beverage;

import edu.bu.met.cs665.example1.Beverage;

public class GreenTea extends Beverage{

    public GreenTea(){
        this.description = "Green Tea";
    }
    @Override
    public float calcualtePrice() {
        // TODO Auto-generated method stub
        return this.baseprice;
    }
}

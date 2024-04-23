package edu.bu.met.cs665.example1.beverage;

import edu.bu.met.cs665.example1.Beverage;

public class BlackTea extends Beverage{

    public BlackTea(){
        this.description = "Black Tea";
    }
    @Override
    public float calcualtePrice() {
        // TODO Auto-generated method stub
        return this.baseprice;
    }
}

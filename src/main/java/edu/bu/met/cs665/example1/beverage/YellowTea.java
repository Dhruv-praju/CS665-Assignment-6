package edu.bu.met.cs665.example1.beverage;

import edu.bu.met.cs665.example1.Beverage;

public class YellowTea extends Beverage{

    public YellowTea(){
        this.description = "Yellow Tea";
    }
    @Override
    public float calcualtePrice() {
        // TODO Auto-generated method stub
        return this.baseprice;
    }
}

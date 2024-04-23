package edu.bu.met.cs665.example1.beverageFactory;

import edu.bu.met.cs665.example1.Beverage;
import edu.bu.met.cs665.example1.VendingMachine;
import edu.bu.met.cs665.example1.beverage.BlackTea;
// import edu.bu.met.cs665.example1.beverage.BlackTea;
import edu.bu.met.cs665.example1.beverage.GreenTea;

public class TeaFactory implements VendingMachine{

    @Override
    public Beverage createBeverage(String teaType) {
        // TODO Auto-generated method stub
         if (teaType.equals("Green")) {
            return new GreenTea();
        } else if(teaType.equals("Black")){
            return new BlackTea();
        } else if(teaType.equals("Yellow")){
            return new GreenTea();
        } else{
            return null;
        }
    }
}

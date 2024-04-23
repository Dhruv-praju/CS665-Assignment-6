package edu.bu.met.cs665.example1;

public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;
    protected int quantity;
    protected int maxQty=3;
    protected float price=0.5f;

    public abstract String getDescription();

    public void setMaxQty(int maxQty) {
        this.maxQty = maxQty;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}

package com.core.java.structural.designpattern.decorator;

public class CheeseDecorator extends PizzaDecorator{

    protected CheeseDecorator(Pizza decoratedPiza) {
        super(decoratedPiza);
    }

    @Override
    public String getDescription() {
        return decoratedPiza.getDescription()+ ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPiza.getCost();
    }
}

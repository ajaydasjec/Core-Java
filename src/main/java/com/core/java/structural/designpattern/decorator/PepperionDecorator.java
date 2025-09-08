package com.core.java.structural.designpattern.decorator;

public class PepperionDecorator extends PizzaDecorator{
    protected PepperionDecorator(Pizza decoratedPiza) {
        super(decoratedPiza);
    }

    @Override
    public String getDescription() {
        return decoratedPiza.getDescription()+", Pepperion Pizza";
    }

    @Override
    public double getCost() {
        return decoratedPiza.getCost() + 200;
    }
}

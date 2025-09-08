package com.core.java.structural.designpattern.decorator;

public abstract class PizzaDecorator implements Pizza{
    protected final Pizza decoratedPiza;

    protected PizzaDecorator(Pizza decoratedPiza) {
        this.decoratedPiza = decoratedPiza;
    }

}

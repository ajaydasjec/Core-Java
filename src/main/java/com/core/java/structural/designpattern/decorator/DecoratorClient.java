package com.core.java.structural.designpattern.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        pizza = new CheeseDecorator(pizza);
        pizza = new PepperionDecorator(pizza);

        System.out.println("Description :"+pizza.getDescription());
        System.out.println("Cost :"+pizza.getCost());
    }
}

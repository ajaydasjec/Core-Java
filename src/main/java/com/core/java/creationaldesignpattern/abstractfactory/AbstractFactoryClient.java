package com.core.java.creationaldesignpattern.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.getFactoryInstances("Premium");
        Car car = abstractFactory.getInstance(4000000);
        System.out.println(car.getTopSpeed());
    }
}

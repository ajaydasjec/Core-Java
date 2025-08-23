package com.core.java.dynamicproxy;

public class Car implements IVehicle{

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Car "+this.name+" started");
    }

    @Override
    public void stop() {
        System.out.println("Car "+this.name+" stopped");
    }

    @Override
    public void forward() {
        System.out.println("Car "+this.name+" forwarded");
    }

    @Override
    public void reverse() {
        System.out.println("Car "+this.name+" reversed");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

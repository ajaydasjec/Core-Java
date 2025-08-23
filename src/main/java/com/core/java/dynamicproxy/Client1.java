package com.core.java.dynamicproxy;

public class Client1 {
    public static void main(String[] args) {
        IVehicle vehicle = new Car("Baleno Zeta");
        vehicle.start();
        vehicle.forward();
        vehicle.stop();

    }
}

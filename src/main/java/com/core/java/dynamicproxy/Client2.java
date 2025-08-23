package com.core.java.dynamicproxy;

/* Interacts with car vehicle through a VehicleProxy */
public class Client2 {
    public static void main(String[] args) {
        IVehicle car = new Car("Baleno");
        IVehicle vehicle = new VehicleProxy(car);

        vehicle.start();
        vehicle.forward();
        vehicle.reverse();
        vehicle.stop();
    }
}

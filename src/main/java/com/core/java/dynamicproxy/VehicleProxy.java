package com.core.java.dynamicproxy;

public class VehicleProxy implements IVehicle{
    private IVehicle vehicle;

    public VehicleProxy(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void start() {
        System.out.println("Vehicle proxy begin to start");
        vehicle.start();
        System.out.println("Vehicle proxy ends start");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle proxy begin to stop");
        vehicle.stop();
        System.out.println("Vehicle proxy ends stop");
    }

    @Override
    public void forward() {
        System.out.println("Vehicle proxy begin to forward");
        vehicle.forward();
        System.out.println("Vehicle proxy ends forward");
    }

    @Override
    public void reverse() {
        System.out.println("Vehicle proxy begin to reverse");
        vehicle.reverse();
        System.out.println("Vehicle proxy ends reverse");
    }

    @Override
    public String getName() {
        return this.vehicle.getName();
    }
}

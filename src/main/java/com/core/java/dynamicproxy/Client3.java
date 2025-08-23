package com.core.java.dynamicproxy;

import java.lang.reflect.Proxy;

/*Interacts with car vehicle through dynamically generated vehicle proxy*/
public class Client3 {

    public static void main(String[] args) {
        IVehicle c = new Car("Baleno");
        ClassLoader loader = IVehicle.class.getClassLoader();
        IVehicle v = (IVehicle) Proxy.newProxyInstance(loader, new Class[] {IVehicle.class}, new VehicleHandler(c));
        v.start();
        v.forward();
        v.reverse();
        v.stop();
    }
}

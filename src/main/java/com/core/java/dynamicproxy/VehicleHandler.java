package com.core.java.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* To do our vehicle example with a dynamic proxy, we first need
an invocation handler */
public class VehicleHandler implements InvocationHandler {

    private IVehicle vehicle;

    public VehicleHandler(IVehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Vehicle Handler: invoking "+ method.getName());
        return method.invoke(this.vehicle, args);
    }
}

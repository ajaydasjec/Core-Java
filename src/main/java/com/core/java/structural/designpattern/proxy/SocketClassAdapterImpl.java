package com.core.java.structural.designpattern.proxy;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return null;
    }

    @Override
    public Volt get3Volt() {
        return null;
    }
}

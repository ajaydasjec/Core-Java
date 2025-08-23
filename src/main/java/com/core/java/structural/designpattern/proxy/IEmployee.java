package com.core.java.structural.designpattern.proxy;

public interface IEmployee {
    void create(String clientId, int employeeId);
    void delete(String clientId, int employeeId);
    Employee get(String clientId, int employeeId);
}

package com.core.java.structural.designpattern.proxy;

public class EmployeeImpl implements IEmployee{
    @Override
    public void create(String clientId, int employeeId) {
        System.out.println("Employee created");
    }

    @Override
    public void delete(String clientId, int employeeId) {
        System.out.println("Employee deleted");
    }

    @Override
    public Employee get(String clientId, int employeeId) {
        return new Employee("Ajay");
    }
}

package com.core.java.structural.designpattern.proxy;
public class EmployeeProxy implements IEmployee{
    IEmployee employee;

    public EmployeeProxy() {
        this.employee = new EmployeeImpl();
    }

    @Override
    public void create(String clientId, int employeeId) {
        if (clientId.equals("ADMIN")){
            this.employee.create(clientId,employeeId);
        }else {
            System.out.println("Does not have access");
        }

    }

    @Override
    public void delete(String clientId, int employeeId) {
        if(clientId.equals("ADMIN")){
            this.employee.delete(clientId,employeeId);
        }else {
            System.out.println("Does not have access");
        }
    }

    @Override
    public Employee get(String clientId, int employeeId) {
        if (clientId.equals("ADMIN") || clientId.equals("USER")){
            return new Employee("Ajay");
        }else {
            System.out.println("Does not have permission");
            return null;
        }

    }
}

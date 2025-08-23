package com.core.java.java8QA;

import java.util.*;
import java.util.stream.Collectors;

public class DemoApplication {
    static List<Employee> employees = Arrays.asList(
            new Employee(1, "Abraham", 29, "IT", "Mumbai", 20000, "Male"),
            new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
            new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
            new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
            new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
            new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
            new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
    );
    public static void main(String[] args) {
        //Find Employee whose name starts with A
        List<Employee> emp = employees.stream()
                .filter(e ->e.getName().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(emp);
        // Group the employee by Department name
        Map<String, List<Employee>> deptWithEmployee = employees.stream().collect(Collectors.groupingBy(e -> e.getDepartNames()));
        System.out.println(deptWithEmployee);
        // Total number of employee
        long count = employees.stream().collect(Collectors.counting());
        System.out.println("Total Employee: "+count);

        //Get Maximum age of the employee
        int maxInt =employees.stream().mapToInt(Employee::getAge).max().getAsInt();
        System.out.println("Maximum Age: "+maxInt);

        //Get All department
        Set<String> allDept =  employees.stream().map(e ->e.getDepartNames()).collect(Collectors.toSet());
        System.out.println(allDept);

        //Get Employee Count by Dept
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.counting()));
        System.out.println(collect);

        List<Employee> ageLessThan30 = employees.stream().filter(e->e.getAge()<=30).collect(Collectors.toList());
        System.out.println(ageLessThan30);

        Map<String, Double> agerageAgeOfMaleAndFemale = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(agerageAgeOfMaleAndFemale);

        Map.Entry<String,Long> detMaxCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(detMaxCount);

        List<Employee> empStayingInChennaiAndSortedByNamr = employees.stream()
                .filter(e -> e.getAddress().equals("Chennai")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(empStayingInChennaiAndSortedByNamr);

        Map<String, Double> avgSalaryEachDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryEachDept);

        Map<String,Optional<Employee>> highestSalaryEachDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartNames,Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(highestSalaryEachDept);

        List<Employee> employeeWithSortedSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(employeeWithSortedSalary);

        Employee employeeWithSecondHighestSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
        System.out.println(employeeWithSecondHighestSalary);



    }

}

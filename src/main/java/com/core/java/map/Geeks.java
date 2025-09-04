package com.core.java.map;

import java.util.HashMap;

public class Geeks {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Geek1");
        Student student2 = new Student(2, "Geek2");
        Student student3 = new Student(1, "Geek3");

        HashMap<Student, String> hm = new HashMap<>();
        hm.put(student1, "A Grade");
        hm.put(student2, "B Grade");

        System.out.println("Grade of student1: " + hm.get(student1));
        System.out.println("Grade of student2: " + hm.get(student2));

        // Using student3 (same id as student1) to retrieve value
        System.out.println("Grade of student3 " + hm.get(student3));
    }
}

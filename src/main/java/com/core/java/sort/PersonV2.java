package com.core.java.sort;

public class PersonV2 implements Comparable<PersonV2>{
    String name;
    int age;
    double weight;

    public PersonV2(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PersonV2 [name=" + name + ", age=" + age + ", weight=" + weight + " kgs]";
    }

    @Override
    public int compareTo(PersonV2 other) {
        return this.age - other.age;
    }
}

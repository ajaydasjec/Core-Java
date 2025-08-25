package com.core.java.creationaldesignpattern.builder;

public class BuilderPatternClient {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder.getPersonBuilder()
                .setFirstName("Aja")
                .setLastName("Das")
                //.setAge(47)
                .build();
        System.out.println(person);
    }
}

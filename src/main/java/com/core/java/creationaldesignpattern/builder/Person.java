package com.core.java.creationaldesignpattern.builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private Person(PersonBuilder personBuilder){
        //Initialize
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.age = personBuilder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //Inner Class to create object
    static  class PersonBuilder{
        private String firstName;
        private String lastName;
        private int age;

        private PersonBuilder(){

        }
        public static PersonBuilder getPersonBuilder(){
            return new PersonBuilder();
        }

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

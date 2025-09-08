package com.core.java.java8QA;

public class StringContainsVowels {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.toLowerCase().matches(".*[aeiou]*."));
    }
}

package com.core.java.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimitiveSorting {
    public static void main(String[] args) {
        int[] numbers = {5,3,8,1,0,9,7,8,6,2,4};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array: "+Arrays.toString(numbers));

        char[] character = {'i','a','u','o','e'};
        System.out.println("Original Array: "+Arrays.toString(character));

        Arrays.sort(character);
        System.out.println("Sorted Array: "+Arrays.toString(character));

        List<String> wordList = Arrays.asList("Banana", "Apple","Cherry", "Date");
        System.out.println("Original list: "+wordList);
        Collections.sort(wordList);
        System.out.println("Sorted List: "+wordList);

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 30, 65.5),
                new Person("Bob", 25, 75.0),
                new Person("Charlie", 35, 80.0)
        ));
        System.out.println("Original people list: "+ people);
        //Collections.sort(people);

        List<PersonV2> peopleV2 = new ArrayList<>(Arrays.asList(
                new PersonV2("Alice", 30, 65.5),
                new PersonV2("Bob", 25, 75.0),
                new PersonV2("Charlie", 35, 80.0)
        ));
        System.out.println("Original peopleV2 list: "+ peopleV2);
        Collections.sort(peopleV2);
        System.out.println("Sorted peopleV2 list : "+peopleV2);




    }
}

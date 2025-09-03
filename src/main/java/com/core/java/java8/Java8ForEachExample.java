package com.core.java.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,3,5,78);
        /*Traversing using Iterator*/
        Iterator<Integer> itr = myList.iterator();
        while (itr.hasNext()){
            Integer integer =  itr.next();
            System.out.println("Iterator value: "+integer);
        }
        /*Traversing through forEach method of Iterable with anonymous class*/
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class value: "+ integer);
            }
        });
        /*Consumer Implementation that can be reused*/
        myList.forEach(new MyConsumer());
        /*Lambda implementation */
        myList.forEach(System.out::println);

    }
}
class MyConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println("Consumer Implementation value: "+ integer);
    }
}

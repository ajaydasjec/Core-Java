package com.core.java.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccurrenceCountUsingHashMap {
    public static void main(String[] args) {
        int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };


        List<Integer> al = Arrays.stream(a).boxed().toList();

        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num : al){
            map.putIfAbsent(num,Collections.frequency(al,num));
        }
        System.out.println(map);
    }
}

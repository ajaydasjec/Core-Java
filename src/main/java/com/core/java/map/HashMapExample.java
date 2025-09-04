package com.core.java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Greek1",1);
        map.put("Greek2",2);
        map.put("Greek3",3);
        map.put(null,null);
        map.put("Greek5",null);
        //map.put(null,null);
        //map.put(null,null);
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);

        System.out.println(map);
        System.out.println("Traversing Map using Map.Entry");
        //The Map.entrySet method returns a collection-view of the map, whose elements are of this class Map.Entry
        //map.entrySet() returns Set<Map.Entry<String,Integer>> that is set view of the map
        for (Map.Entry<String,Integer> mapEntry : map.entrySet()){
            System.out.println(mapEntry.getKey() +" : "+mapEntry.getValue());
        }

    }
}

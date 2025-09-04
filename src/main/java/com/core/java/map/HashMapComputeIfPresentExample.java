package com.core.java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapComputeIfPresentExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "10");
        map.put("2", "20");
        map.put(null, "100");
        map.put("10", null);
        System.out.println("map before computeIfPresent: "+map);
        for(String key: map.keySet()){
            map.computeIfPresent(key, (k,v)-> k+v);
        }
        System.out.println("map after computeIfPresent: "+ map);
        map.computeIfPresent("1",(k,v)-> null);
        System.out.println("map after computeIfPresent: "+map);
    }
}

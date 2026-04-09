package com.itheima.map;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        calc();
    }

    public static void calc(){
        List<String> locations = new ArrayList<>();
        String[] locationsArray = {"龙游", "青丘", "风陵渡", "云梦泽", "归墟"};
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(locationsArray.length);
            locations.add(locationsArray[index]);
        }
        System.out.println(locations);

        Map<String, Integer> map = new HashMap<>();

        for (String location : locations) {
            map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
        }

        map.forEach((k,v)-> System.out.println(k + ":" + v));

    }

}

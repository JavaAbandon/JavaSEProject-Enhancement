package com.itheima.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("小黑", 10);
        map.put("小白", 10);
        map.put("无限", 440);
        map.put("师姐", 140);
        map.put(null,null);
        System.out.println(map);

        //常用api
        System.out.println(map.get("小黑"));// 根据键获取值
        System.out.println(map.containsKey("小黑"));// 判断键是否存在
        System.out.println(map.containsValue(10));// 判断值是否存在
        System.out.println(map.isEmpty());//  判断是否为空
        System.out.println(map.size());// 获取长度
        System.out.println(map.remove("小黑"));// 删除键值对
//        map.clear();
//        System.out.println(map);
//        System.out.println(map.isEmpty());
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        // 获取所有值
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        //遍历
       Set<String> set = map.keySet();
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        //键值对遍历
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        // lambda
        map.forEach((key,value)->{ System.out.println(key + "=" + value);});


    }
}

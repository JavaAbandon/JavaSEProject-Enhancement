package com.itheima.map;

import java.util.*;

/**
 * Map集合演示类
 * 演示如何使用HashMap统计元素出现次数
 * 应用场景：随机生成地点并统计每个地点出现的频次
 */
public class Demo {
    public static void main(String[] args) {
        // 调用统计方法
        calc();
    }

    /**
     * 统计方法：随机生成80个地点，统计每个地点出现的次数
     * 使用Map集合实现词频统计功能
     */
    public static void calc(){
        // 创建列表存储随机生成的地点
        List<String> locations = new ArrayList<>();
        // 定义地点数组
        String[] locationsArray = {"龙游", "青丘", "风陵渡", "云梦泽", "归墟"};
        Random random = new Random();
        // 循环80次，每次随机选择一个地点添加到列表中
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(locationsArray.length);
            locations.add(locationsArray[index]);
        }
        System.out.println(locations);

        // 创建HashMap用于统计地点出现次数，key为地点名，value为次数
        Map<String, Integer> map = new HashMap<>();

        // 遍历地点列表，统计每个地点的出现次数
        for (String location : locations) {
            // 如果map中已存在该地点，次数+1；否则初始化为1
            map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
        }

        // 使用forEach和Lambda表达式打印统计结果
        map.forEach((k,v)-> System.out.println(k + ":" + v));

    }

}

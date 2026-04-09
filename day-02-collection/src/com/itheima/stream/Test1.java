package com.itheima.stream;

import java.util.*;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        //展示获取Stream流的几种方法
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        Map map = new HashMap();
        Stream<String> s2 = map.keySet().stream();// 获取键的Stream流
        Stream<String> s3 = map.values().stream();// 获取值的Stream流
        Stream<String> s4 = map.entrySet().stream();// 获取键值对Stream流

        String [] array = {"张三", "李四", "王五"};
        Stream<String> s5 = Arrays.stream(array);
        Stream<String> s6 = Stream.of("张三", "李四", "王五");
    }
}

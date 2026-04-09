package com.itheima.stream;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("李寻欢");
        list.add("周芷若");
        list.add("张三丰");
        list.add("张翠山");
        //传统方案，找出张姓放入一个集合
        List<String> newList = new ArrayList<>();
        for (String name : list){
            if (name.startsWith("张")){
                newList.add(name);
            }
        }
        System.out.println(newList);
        System.out.println("============================");
        //使用stream流
        list.stream().filter(name -> name.startsWith("张")).forEach(System.out::println);
    }
}

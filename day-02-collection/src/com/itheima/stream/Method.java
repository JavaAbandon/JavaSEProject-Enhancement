package com.itheima.stream;

import java.util.ArrayList;
import java.util.List;

public class Method {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("李寻欢");
        list.add("周芷若");
        list.add("张三丰");
        list.add("张翠山");

        //展示中间方法
        list.stream().filter(name -> name.startsWith("张")).forEach(System.out::println);// 筛选

        List<String> scores = new ArrayList<>();
        scores.add("70");
        scores.add("60");
        scores.add("90");
        scores.add("80");
        scores.stream().sorted().forEach(System.out::println);


    }
}

package com.itheima.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream流演示类
 * 对比传统集合遍历和Stream流处理的方式
 * 展示Stream流的简洁性和函数式编程优势
 */
public class Test {
    public static void main(String[] args) {
        // 创建包含人名的列表
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("李寻欢");
        list.add("周芷若");
        list.add("张三丰");
        list.add("张翠山");
        
        // 传统方案：使用for循环筛选张姓人员并放入新集合
        List<String> newList = new ArrayList<>();
        for (String name : list){
            if (name.startsWith("张")){
                newList.add(name);
            }
        }
        System.out.println(newList);
        System.out.println("============================");
        
        // 使用Stream流：链式调用，代码更简洁
        // filter过滤出张姓，forEach打印每个元素
        list.stream().filter(name -> name.startsWith("张")).forEach(System.out::println);
    }
}

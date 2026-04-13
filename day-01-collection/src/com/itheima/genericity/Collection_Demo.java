package com.itheima.genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合泛型演示类
 * 展示如何使用泛型来约束集合中元素的类型
 * 演示迭代器遍历集合的方法
 */
public class Collection_Demo {
    public static void main(String[] args) {
        // 创建String类型的ArrayList集合，泛型保证只能存储字符串
        Collection<String> names = new ArrayList<>();
        // 向集合中添加元素
        names.add("张三");
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

        // 获取集合的迭代器对象
        Iterator<String> it = names.iterator();
        // 使用while循环和迭代器遍历集合
        while(it.hasNext()){
            String name = it.next();  // 获取下一个元素
            System.out.println(name);
        }
    }
}

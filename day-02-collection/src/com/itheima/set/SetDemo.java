package com.itheima.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set集合演示类
 * 演示HashSet的去重特性
 * 通过Student对象展示Set集合如何自动去除重复元素
 * 注意：Student类需要重写hashCode和equals方法才能实现正确的去重
 */
@SuppressWarnings("DuplicatedCode")
public class SetDemo {
    public static void main(String[] args) {
        // 创建10个学生对象，其中包含重复的学生信息
        Student s1 = new Student("张三", 18, "13812345678", "上海");
        Student s2 = new Student("李四", 19, "15912345679", "北京");
        Student s3 = new Student("王五", 20, "13612345680", "广州");
        Student s4 = new Student("赵六", 18, "18912345681", "深圳");
        Student s5 = new Student("孙七", 21, "13512345682", "杭州");
        // 以下是重复的学生对象
        Student s6 = new Student("张三", 18, "13812345678", "上海");
        Student s7 = new Student("李四", 19, "15912345679", "北京");
        Student s8 = new Student("王五", 20, "13612345680", "广州");
        Student s9 = new Student("赵六", 18, "18912345681", "深圳");
        Student s10= new Student("孙七", 21, "13512345682", "杭州");

        // 创建HashSet集合存储学生对象
        Set<Student> set = new HashSet<>();
        // 将学生对象添加到Set集合中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);
        set.add(s8);
        set.add(s9);
        set.add(s10);

        // 打印Set集合，重复的元素会被自动去除
        System.out.println(set);



    }

}

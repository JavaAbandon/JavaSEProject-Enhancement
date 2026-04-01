package com.itheima;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("DuplicatedCode")
public class SetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, "13812345678", "上海");
        Student s2 = new Student("李四", 19, "15912345679", "北京");
        Student s3 = new Student("王五", 20, "13612345680", "广州");
        Student s4 = new Student("赵六", 18, "18912345681", "深圳");
        Student s5 = new Student("孙七", 21, "13512345682", "杭州");
        Student s6 = new Student("张三", 18, "13812345678", "上海");
        Student s7 = new Student("李四", 19, "15912345679", "北京");
        Student s8 = new Student("王五", 20, "13612345680", "广州");
        Student s9 = new Student("赵六", 18, "18912345681", "深圳");
        Student s10= new Student("孙七", 21, "13512345682", "杭州");

        Set<Student> set = new HashSet<>();
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

        System.out.println(set);



    }

}

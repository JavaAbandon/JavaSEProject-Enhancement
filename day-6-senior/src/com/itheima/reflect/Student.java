package com.itheima.reflect;

import lombok.Data;


@Data
public class Student {
    private String name;
    private int age;
    private String hobby;

    private Student(){
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void show(){
        System.out.println("show()方法执行了...");
    }
    private void showHome(String home){
        System.out.println("showHome()方法执行了..." + home);
    }
}

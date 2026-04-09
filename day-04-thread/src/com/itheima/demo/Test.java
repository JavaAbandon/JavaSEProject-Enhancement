package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        // 创建账户
        Account a = new Account("ICBC-110",100000);

        // 创建两个线程
        new DrawThread("小明", a).start();
        new DrawThread("小红", a).start();

    }
}

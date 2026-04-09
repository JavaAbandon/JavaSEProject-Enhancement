package com.itheima.basic;

public class ThreadTest {
    public static void main(String[] args) {// main方法本身是由主线程执行的
        // 创建线程对象
        Thread t1 = new MyThread();
        // 启动线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }



    }
}


package com.itheima.demo2;


import java.util.ArrayList;
import java.util.List;

public class ThreadTest {
    public static void main(String[] args) {
        List<Integer> redPocket = getRedPocket();
        //创建100个线程 模拟抢红包
        for (int i = 1; i <= 100; i++) {
            new MyThread(redPocket,"人"+i).start();
        }
    }

    public static List<Integer> getRedPocket(){
        List<Integer> redPocket = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            double random = Math.random();
            int money;
            if (random < 0.8) {
                money = (int)(Math.random() * 30) + 1;
            } else {
                money = (int)(Math.random() * 70) + 31;
            }
            redPocket.add(money);
        }
        return redPocket;
    }
}

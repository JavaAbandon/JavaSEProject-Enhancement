package com.itheima.demo2;

import java.util.List;

public class MyThread extends Thread{
    private final List<Integer> redPocket;

    public MyThread(List<Integer> redPocket, String name) {
        super(name);
        this.redPocket = redPocket;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (redPocket) {
                if (redPocket.isEmpty()) {
                    break;
                }
                // 随机一个索引得到红包
                int index = (int)(Math.random() * redPocket.size());
                Integer money = redPocket.remove(index);
                System.out.println(name + "抢到了" + money + "元");
                if (redPocket.isEmpty()) {
                    System.out.println("==========活动结束==========");
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

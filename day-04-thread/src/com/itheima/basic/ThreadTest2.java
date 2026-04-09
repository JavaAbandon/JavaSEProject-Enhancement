package com.itheima.basic;

public class ThreadTest2 {
    public static void main(String[] args) {
        // 创建线程对象
        Runnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        // 启动线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}
/**线程任务类**/
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出：" + i);
        }
    }
}
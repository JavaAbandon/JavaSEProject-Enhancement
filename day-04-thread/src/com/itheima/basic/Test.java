package com.itheima.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        Callable<String> c = new MyCallable(100);
        FutureTask<String> ft = new FutureTask<>(c);// 本质是一个Runnable线程任务对象，可以通过FutureTask获取线程任务的执行结果
        Thread t1 = new Thread(ft);
        t1.start();
        // 获取线程任务的执行结果
        try {
            String result = ft.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyCallable implements Callable<String> {
    private final int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "子线程计算出的结果是" + sum;
    }
}
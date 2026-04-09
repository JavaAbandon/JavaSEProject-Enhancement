package com.itheima.executor;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
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
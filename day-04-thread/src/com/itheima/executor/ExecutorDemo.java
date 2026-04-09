package com.itheima.executor;

import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor( 3, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());
        Runnable r = new MyRunnable();
        pool.execute(r);// 提交第一个任务
        pool.execute(r);// 提交第二个任务
        pool.execute(r);// 提交第三个任务

        // 处理callable任务
        Future<String> f = pool.submit(new MyCallable(100));
        try {
            System.out.println(f.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
//
//        //关闭线程池，一般不关
//        pool.shutdown();// 等待所有任务执行完毕，才关闭
//        pool.shutdownNow();// 停止所有正在执行的任务，并关闭

    }
}

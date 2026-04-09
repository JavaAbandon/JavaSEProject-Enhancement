package com.itheima.bs;

import java.net.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Sever {
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端启动了======");
        // 创建服务端Socket对象，绑定端口号，监听客户端链接
        ServerSocket ss = new ServerSocket(8080);
        //创建线程池
        ExecutorService pool = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
        while (true) {
            // 调用accept方法，获取Socket对象，与客户端连接，一旦有客户端连接，就会返回Socket对象
            Socket socket  = ss.accept();
            System.out.println("一个客户端连接了..."+socket.getInetAddress().getHostAddress()+":"+socket.getPort());
            pool.execute(new SeverReader(socket));
        }
    }
}

package com.itheima;

import com.itheima.utils.Constant;
import com.itheima.utils.SeverReader;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Sever {
    public static final Map<Socket, String> onlineUsers = new HashMap<>();
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端启动了======");
        try {
            //注册端口
            ServerSocket ss = new ServerSocket(Constant.PORT);
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = ss.accept();
                // 把管道交给一个单独的线程处理
                new SeverReader(socket).start();
                System.out.println("一个客户端连接成功" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

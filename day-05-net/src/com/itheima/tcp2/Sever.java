package com.itheima.tcp2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端启动了======");
        // 创建服务端Socket对象，绑定端口号，监听客户端链接
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            // 调用accept方法，获取Socket对象，与客户端连接，一旦有客户端连接，就会返回Socket对象
            Socket socket  = ss.accept();
            System.out.println("一个客户端连接了..."+socket.getInetAddress().getHostAddress()+":"+socket.getPort());
            new Sever2(socket).start();
        }
    }
}

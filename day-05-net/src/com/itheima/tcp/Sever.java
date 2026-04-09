package com.itheima.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端启动了======");
        // 创建服务端Socket对象，绑定端口号，监听客户端链接
        ServerSocket ss = new ServerSocket(8080);
        // 调用accept方法，获取Socket对象，与客户端连接，一旦有客户端连接，就会返回Socket对象
        Socket socket  = ss.accept();
        // 获取输入流，接收数据
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        int id = dis.readInt();
        String msg = dis.readUTF();
        System.out.println("id:" + id + " msg:" + msg);
        // 客户端的ip和端口
        System.out.println("客户端的ip和端口：" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort());
    }
}

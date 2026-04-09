package com.itheima.tcp2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Sever2 extends Thread {
    private Socket socket;
    public Sever2(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run()  {
        // 获取输入流，接收数据
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                String msg = dis.readUTF();
                System.out.println("服务端接收到的数据：" + msg);
                System.out.println("客户端的ip：" + socket.getInetAddress().getHostAddress());
                System.out.println("客户端的端口：" + socket.getPort());
                System.out.println("-----------------------");
            }
        } catch (Exception e) {
            System.out.println("客户端断开了连接..."+socket.getInetAddress().getHostAddress()+":"+socket.getPort());
        }

    }
}



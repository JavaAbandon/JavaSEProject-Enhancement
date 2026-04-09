package com.itheima.tcp;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端启动了...");
        // 创建Socket管道对象，请求与服务端的socket连接，可靠链接
        Socket socket = new Socket("127.0.0.1",8080);

        // 获取输出流，发送数据
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeInt(1001);
        dos.writeUTF("祝融一号向您问好");

        socket.close();
    }
}

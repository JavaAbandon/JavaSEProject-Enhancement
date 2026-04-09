package com.itheima.tcp2;


import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端启动了...");
        // 创建Socket管道对象，请求与服务端的socket连接，可靠链接
        Socket socket = new Socket("127.0.0.1",8080);

        // 获取输出流，发送数据
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                System.out.println("客户端退出了...");
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}

package com.itheima.udp;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        //创建发送端Socket对象
        try {
            System.out.println("======客户端启动了======");
            // 创建发送端Socket对象
            DatagramSocket socket = new DatagramSocket();
            //创建数据，并把数据打包
            byte[] bys = "我是客户端，放学别走".getBytes();
            /*
              参数一：发送的数据，字节数组（韭菜）
              参数二：发送的字节长度
              参数三：指定发送的目标地址
              参数四：服务端程序端口号
             */
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getLocalHost(), 8080);
            socket.send(dp);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

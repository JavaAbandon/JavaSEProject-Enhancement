package com.itheima.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPSever {
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端启动了======");
        DatagramSocket socket = new DatagramSocket(8080);
        // 创建一个数据报，用于接收数据
        byte[] buf = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        while (true) {
            // 接收数据
            socket.receive(packet);
            // 获取数据
            String data = new String(buf, 0, packet.getLength());
            System.out.println("服务端接收到的数据：" + data);

            // 获取发送端的地址和端口号
            String address = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("发送端的地址和端口号：" + address + ":" + port);
            System.out.println("==================================================");
        }
    }
}

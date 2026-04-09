package com.itheima.udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        //创建发送端Socket对象
        System.out.println("======客户端启动了======");
        // 创建发送端Socket对象
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        //创建数据，并把数据打包
        while (true) {
            System.out.println("请输入发送的数据：");
            String data = scanner.nextLine();

            if ("exit".equals(data)) {
                System.out.println("====客户端退出====");
                socket.close();
                break;
            }

            byte[] bys = data.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getLocalHost(), 8080);
            socket.send(dp);
        }
    }
}

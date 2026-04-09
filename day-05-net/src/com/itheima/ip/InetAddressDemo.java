package com.itheima.ip;

import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            // 创建InetAddress对象
            // InetAddress localHost = InetAddress.getLocalHost();
            InetAddress inet = InetAddress.getByName("www.baidu.com");
            // 获取ip地址
            String ip = inet.getHostAddress();
            System.out.println(ip);
            // 获取主机名
            String hostName = inet.getHostName();
            System.out.println(hostName);
            // 获取对方ip对象
            InetAddress inet2 = InetAddress.getByName("192.168.1.1");
            System.out.println(inet2);

            // 判断是否可达
            boolean reachable = inet2.isReachable(5000);
            System.out.println(reachable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

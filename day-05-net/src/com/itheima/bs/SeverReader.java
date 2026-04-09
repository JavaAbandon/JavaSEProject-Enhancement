package com.itheima.bs;


import java.io.*;
import java.net.*;

public class SeverReader extends Thread {
    private Socket socket;
    public SeverReader(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run()  {
        // 获取输入流，接收数据
        try {
            //给当前对应管道响应一个网页数据回去
            OutputStream os = socket.getOutputStream();
            //通过字节输出流包装写出的数据给浏览器
            //把字节输出流包装成打印流
            PrintStream pw = new PrintStream(os);
            //写响应的网页数据出去
            pw.println("HTTP/1.1 200 OK");
            pw.println("Content-Type:text/html;charset=utf-8");
            pw.println();
            pw.println("<html>");
            pw.println("<head><title>响应数据</title></head>");
            pw.println("<body>");
            pw.println("<h1>鞠婧祎牛掰克拉斯</h1>");
            pw.println("<img src='https://img2.baidu.com/it/u=2428934220,212359335&fm=253&fmt=auto&app=120&f=JPEG?w=500&h=657'>");
            pw.println("</body>");
            pw.println("</html>");
            pw.close();
            socket.close();

        } catch (Exception e) {
            System.out.println("客户端断开了连接..."+socket.getInetAddress().getHostAddress()+":"+socket.getPort());
        }

    }
}



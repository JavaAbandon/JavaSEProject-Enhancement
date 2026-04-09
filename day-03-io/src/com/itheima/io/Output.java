package com.itheima.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Output {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("day-03-io/src/com/itheima/aaa/a.txt");
        //缓冲流
        out.write(97);
        out.write('b');
        out.write("\r\n".getBytes());

        //写一个字节数组
        byte[] bs = "鞠婧祎露芜衣".getBytes();
        out.write(bs);
        out.write("\r\n".getBytes());

        //写一个字节数组的一部分
        out.write(bs, 0, 9);
        out.write("\r\n".getBytes());

        out.close();
    }
}

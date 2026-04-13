package com.itheima.io;

import java.io.*;

/**
 * 字节输入流演示类
 * 展示FileInputStream的三种读取方式：
 * 1. 单字节读取（效率低）
 * 2. 字节数组读取（效率高）
 * 3. 一次性读取全部字节（适合小文件）
 */
public class Input {
     public static void main(String[] args) throws Exception {
         // 创建文件输入流，从指定文件读取数据
         InputStream in = new FileInputStream("day-03-io/src/com/itheima/aaa/b.txt");

         // 方式1：每次读一个字节（效率较低，不推荐）
//         int b;
//         while ((b = in.read()) != -1) {  // read()返回-1表示读到文件末尾
//             System.out.print((char) b);  // 将字节转换为字符
//         }
//         System.out.println();
         System.out.println("-----------------");
         
         // 方式2：每次读一个字节数组（推荐，效率高）
//          byte[] bs = new byte[1024];  // 创建1KB的缓冲区
//          int len;  // 实际读取的字节数
//          while ((len = in.read(bs)) != -1) {
//             String str = new String(bs, 0, len);  // 将字节数组转换为字符串
//             System.out.print(str);
//          }

          // 方式3：一次性读完全部字节（JDK9+，适合小文件）
          byte[] bs = in.readAllBytes();
          System.out.println(new String(bs));  // 将字节数组转换为字符串并打印

    }
}

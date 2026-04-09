package com.itheima.io;

import java.io.*;

public class Input {
     public static void main(String[] args) throws Exception {
         InputStream in = new FileInputStream("day-03-io/src/com/itheima/aaa/b.txt");

         // 每次读一个字节
//         int b;
//         while ((b = in.read()) != -1) {
//             System.out.print((char) b);
//         }
//         System.out.println();
         System.out.println("-----------------");
//         // 每次读一个字节数组
//          byte[] bs = new byte[1024];
//          int len;
//          while ((len = in.read(bs)) != -1) {
//             String str = new String(bs, 0, len);
//             System.out.print(str);
//          }

          // 一次性读完全部
          byte[] bs = in.readAllBytes();
          System.out.println(new String(bs));

    }
}

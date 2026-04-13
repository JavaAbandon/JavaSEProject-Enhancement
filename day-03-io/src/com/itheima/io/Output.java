package com.itheima.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 字节输出流演示类
 * 展示FileOutputStream的写入操作，包括：
 * - 写入单个字节
 * - 写入字节数组
 * - 写入字节数组的一部分
 */
public class Output {
    public static void main(String[] args) throws Exception {
        // 创建文件输出流，向指定文件写入数据（如果文件不存在则创建）
        OutputStream out = new FileOutputStream("day-03-io/src/com/itheima/aaa/a.txt");
        
        // 方式1：写入单个字节
        out.write(97);  // 写入ASCII码为97的字符 'a'
        out.write('b');  // 直接写入字符 'b'
        out.write("\r\n".getBytes());  // 写入换行符（Windows系统）

        // 方式2：写入整个字节数组
        byte[] bs = "鞠婧祎露芜衣".getBytes();  // 将字符串转换为字节数组
        out.write(bs);
        out.write("\r\n".getBytes());  // 换行

        // 方式3：写字节数组的一部分（从索引0开始，写9个字节）
        out.write(bs, 0, 9);
        out.write("\r\n".getBytes());  // 换行

        // 关闭流，释放资源（重要！）
        out.close();
    }
}

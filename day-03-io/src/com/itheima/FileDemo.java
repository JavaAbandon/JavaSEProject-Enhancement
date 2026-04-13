package com.itheima;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * File类演示程序
 * 展示Java中File对象的基本操作，包括：
 * - 文件属性获取（名称、大小）
 * - 文件和目录的创建
 * - 文件存在性检查
 * - 目录遍历
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
       // File对象创建和文件属性操作
        // 方式1：通过绝对路径创建File对象
        File f1 = new File("C:/Users/rog/Desktop/University/个人/鞠婧祎、/橘子海.jpg");
        System.out.println("文件名：" + f1.getName());  // 获取文件名
        System.out.println("文件大小：" + f1.length());  // 获取文件大小（字节）

        // 方式2：通过相对路径创建File对象
        File f2 = new File("day-03-io/src/com/itheima/FileDemo.java");
        System.out.println("文件大小：" + f1.length());

        // 文件存在性检查和创建
        File f3 = new File("day-03-io/src/com/itheima/aaa/b.txt");
        System.out.println("文件是否存在：" + f3.exists());
        System.out.println("创建文件：" + f3.createNewFile());  // 创建新文件

        // 目录操作
        File f4 = new File("day-03-io/src/com/itheima/aaa");
        System.out.println("创建目录：" + f4.mkdir());  // 创建单级目录

        // 创建多级目录（已注释）
//        System.out.println("创建多级目录：" + f4.mkdirs());
//        System.out.println("删除目录：" + f4.delete());

        // 获取目录下的文件列表
        File f5 = new File("day-03-io/src/com/itheima");
        String[] list = f5.list();  // 列出目录下所有文件和子目录
        if (list != null) {
            for (String s : list) {
                System.out.println(s);
            }
        }

    }
}

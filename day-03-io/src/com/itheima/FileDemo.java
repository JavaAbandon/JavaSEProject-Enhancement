package com.itheima;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
       //file对象创建
        File f1 = new File("C:/Users/rog/Desktop/University/个人/鞠婧祎、/橘子海.jpg");
        System.out.println("文件名：" + f1.getName());
        System.out.println("文件大小：" + f1.length());

        File f2 = new File("day-03-io/src/com/itheima/FileDemo.java");
        System.out.println("文件大小：" + f1.length());

        File f3 = new File("day-03-io/src/com/itheima/aaa/b.txt");
        System.out.println("文件是否存在：" + f3.exists());
        System.out.println("创建文件：" + f3.createNewFile());

        File f4 = new File("day-03-io/src/com/itheima/aaa");
        System.out.println("创建目录：" + f4.mkdir());

        //创建多级目录
//        System.out.println("创建多级目录：" + f4.mkdirs());
//        System.out.println("删除目录：" + f4.delete());

        // 获取文件列表
        File f5 = new File("day-03-io/src/com/itheima");
        String[] list = f5.list();
        if (list != null) {
            for (String s : list) {
                System.out.println(s);
            }
        }

    }
}

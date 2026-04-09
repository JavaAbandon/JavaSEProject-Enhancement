package com.itheima.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
    public static void main(String[] args) throws Exception {
        copyFile("C:/Users/rog/Desktop/University/个人/鞠婧祎、/橘子海.jpg", "day-03-io/src/com/itheima/aaa/橘子海_cp.jpg");
    }

    //复制 文件
    public static void copyFile(String srcPath, String destPath) throws Exception {
        FileInputStream in = new FileInputStream(srcPath);
        FileOutputStream out = new FileOutputStream(destPath);
        byte[] bs = new byte[1024];
        int len;
        while ((len = in.read(bs)) != -1) {
            out.write(bs, 0, len);
        }
        System.out.println("复制完毕");
        out.close();
    }
}

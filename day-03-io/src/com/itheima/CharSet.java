package com.itheima;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class CharSet {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "鞠婧祎牛掰克拉斯aaawsl666";
        // 获取字符串的编码
        byte[] bytes = str.getBytes();// 默认使用UTF-8
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        System.out.println("------------------");

        byte[] newBytes = str.getBytes("GBK");// 指定字符集进行编码
        System.out.println(newBytes.length);
        System.out.println(Arrays.toString(newBytes));

        System.out.println("-------------------");

        String newStr = new String(newBytes);
        System.out.println(newStr);
        String newStr2 = new String(newBytes, "GBK");
        System.out.println(newStr2);
    }
}

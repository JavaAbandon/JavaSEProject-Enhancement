package com.itheima.preknowledge;
//高效拼接字符串
public class Test2 {
    public static void main(String[] args) {
//        String s1 = "hello";
//        //+号拼接,速度慢
//        for (int i = 0; i < 1000000; i++) {
//            s1 += "abc";
//        }
//        System.out.println(s1);
        //定义字符串可以使用String类型，但操作字符串建议使用StringBuilder
        StringBuilder s = new StringBuilder("hello");
        for (int i = 0; i < 1000000; i++) {
            s.append("abc");
        }
        System.out.println(s);

        StringBuilder s2 = new StringBuilder("hello");
        String res = s2.append("abc").append("abc").append("abc").toString();
        System.out.println(res);
    }
}

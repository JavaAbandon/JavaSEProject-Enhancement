package com.itheima.exception;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {

    public static void main(String[] args) {
        test2();
    }
//    public static void test(int  age) {aws
//        saveAge(130);
//        saveAge2(130);
//    }

    public static void test2() {
        System.out.println("程序开始====");
        try {
            show();
            System.out.println("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序异常");
        }
        System.out.println("程序结束====");
    }
    public static void show() throws ParseException, FileNotFoundException {
        String str = "2026-3-25 15:41:21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
        InputStream is = new FileInputStream("d:/a.txt");
    }
    public static void saveAge(int  age) throws AgeIllegalException {
        if (age < 1 || age > 120) {
            //年龄非法 抛出异常
            throw new AgeIllegalException("年龄非法");
        }else{
            System.out.println("保存年龄成功");
        }
    }

    public static void saveAge2(int  age) {
        if (age < 1 || age > 120) {
            //年龄非法 抛出异常
            throw new AgeIllegalRuntimeException("年龄非法");
        }else{
            System.out.println("保存年龄成功");
        }

    }
}

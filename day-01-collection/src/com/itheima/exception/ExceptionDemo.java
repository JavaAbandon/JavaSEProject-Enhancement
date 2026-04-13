package com.itheima.exception;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常处理演示类
 * 展示Java中受检异常和非受检异常的使用方法
 * 包括异常的抛出、捕获和处理机制
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        // 调用测试方法2，演示异常处理
        test2();
    }
//    public static void test(int  age) {aws
//        saveAge(130);
//        saveAge2(130);
//    }

    /**
     * 测试方法2：演示try-catch异常处理机制
     * 捕获并处理方法调用中可能抛出的异常
     */
    public static void test2() {
        System.out.println("程序开始====");
        try {
            // 调用可能抛出异常的方法
            show();
            System.out.println("操作成功");
        } catch (Exception e) {
            // 捕获异常并打印堆栈信息
            e.printStackTrace();
            System.out.println("程序异常");
        }
        System.out.println("程序结束====");
    }
    
    /**
     * 演示方法：同时声明抛出两种受检异常
     * 包括日期解析异常和文件未找到异常
     * @throws ParseException 日期格式解析异常
     * @throws FileNotFoundException 文件未找到异常
     */
    public static void show() throws ParseException, FileNotFoundException {
        // 定义日期字符串
        String str = "2026-3-25 15:41:21";
        // 创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 解析日期字符串，可能抛出ParseException
        Date date = sdf.parse(str);
        System.out.println(date);
        // 尝试打开文件输入流，可能抛出FileNotFoundException
        InputStream is = new FileInputStream("d:/a.txt");
    }
    /**
     * 保存年龄（受检异常版本）
     * 验证年龄是否在合法范围（1-120），如果非法则抛出受检异常
     * @param age 要保存的年龄
     * @throws AgeIllegalException 年龄非法时抛出此受检异常
     */
    public static void saveAge(int  age) throws AgeIllegalException {
        if (age < 1 || age > 120) {
            // 年龄超出合法范围，抛出受检异常
            throw new AgeIllegalException("年龄非法");
        }else{
            System.out.println("保存年龄成功");
        }
    }
    
    /**
     * 保存年龄（运行时异常版本）
     * 验证年龄是否在合法范围（1-120），如果非法则抛出运行时异常
     * @param age 要保存的年龄
     */
    public static void saveAge2(int  age) {
        if (age < 1 || age > 120) {
            // 年龄超出合法范围，抛出运行时异常
            throw new AgeIllegalRuntimeException("年龄非法");
        }else{
            System.out.println("保存年龄成功");
        }
    
    }
}

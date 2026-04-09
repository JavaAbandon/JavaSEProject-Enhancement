package com.itheima.preknowledge;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//获取时间的方案
public class Test1 {
    public static void main(String[] args) {

        //jdk8之前： Date
        Date date = new Date();
        System.out.println(date);
        //简单日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");// 2026年03月25日 15:41:21 星期五 下午
        String format = sdf.format(date);
        System.out.println(format);

        //jdk8之后： LocalDate LocalTime LocalDateTime
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getDayOfYear());
        //时间的格式化
        DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss EEE a");
        String format1 = dtf.format(now);
        System.out.println(format1);
    }
}

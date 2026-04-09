package com.itheima.preknowledge;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Bigdecimal
public class Test3 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);// 0.30000000000000004
        System.out.println(a-b);// -0.1
        System.out.println(a*b);// 0.020000000000000004
        System.out.println(a/b);// 0.5.

        // 解决精度丢失问题
        BigDecimal s = new BigDecimal(a+"");// 最好用字符串转，不要用double直接套进来
        BigDecimal s1 = new BigDecimal(b+"");

        //优化方案
        BigDecimal a1 = BigDecimal.valueOf(a);//封装了字符串构造器，避免精度丢失,不用b+""
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c = a1.add(b1); // 解决精度问题的手段
        double res = c.doubleValue();// 目的
        System.out.println(res);

        // BigDecimal除法
        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.2);
        BigDecimal k = i.divide(j, 2,  RoundingMode.HALF_UP);// 参数：除数 精确几位 舍入模式
        System.out.println(k);
    }

}

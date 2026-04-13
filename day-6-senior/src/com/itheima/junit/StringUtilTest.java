package com.itheima.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// 测试类：用Junit单元测试框架，对业务中的业务方法进行正确性测试
public class StringUtilTest {
    //测试方法：必须是公开public,无参无返回值
    // 测试方法必须加上@Test注解
    @Test
    public void testPrintNumber(){
        StringUtil.printNumber("张三");
        //测试用例
        StringUtil.printNumber(null);
        StringUtil.printNumber("");
        StringUtil.printNumber(" ");
        StringUtil.printNumber("张三丰");
        StringUtil.printNumber("张三  ");
    }

    @Test
    public void testGetMaxIndex(){
        int maxIndex = StringUtil.getMaxIndex("hello world");
        System.out.println(maxIndex);
        //断言
        Assertions.assertEquals(10, maxIndex,"测试失败");

        maxIndex = StringUtil.getMaxIndex("");
        System.out.println(maxIndex);

        maxIndex = StringUtil.getMaxIndex(null);
        System.out.println(maxIndex);

    }
}

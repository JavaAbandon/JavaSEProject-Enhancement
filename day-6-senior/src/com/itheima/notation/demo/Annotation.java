package com.itheima.notation.demo;

import java.lang.reflect.Method;

public class Annotation {
    public static void main(String[] args) throws Exception {
        Annotation annotation = new Annotation();
        Class c = Annotation.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            // 判断方法上是否有MyTest注解
            if (method.isAnnotationPresent(MyTest.class)) {
                MyTest myTest = method.getDeclaredAnnotation(MyTest.class);
                int count = myTest.count();
                for (int i = 0; i < count; i++) {
                    method.invoke(annotation);
                }

            }
        }
    }
    @MyTest
    public static void test(){
        System.out.println("test方法执行了");
    }

    @MyTest(count = 3)
    public static void test1(){
        System.out.println("test1方法执行了");
    }

    public static void test2(){
        System.out.println("test2方法执行了");
    }
}

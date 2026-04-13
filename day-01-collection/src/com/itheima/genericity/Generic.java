package com.itheima.genericity;

import java.lang.reflect.Array;

/**
 * 泛型演示类
 * 展示Java泛型的基本用法，包括泛型方法的定义和使用
 */
public class Generic {
    public static void main(String[] args) {
        // 主方法入口
    }
    
    /**
     * 泛型方法：可以接收任意类型的数组
     * 使用类型参数<T>使方法支持多种数据类型
     * @param arr 任意类型的数组
     * @param <T> 类型参数，表示数组元素的类型
     */
    public static <T> void createArray(T[] arr) {
        // TODO: 实现创建数组的逻辑
    }


}

package com.itheima.exception;

/**
 * 年龄非法异常类（受检异常）
 * 当用户输入的年龄不在合法范围（1-120）时抛出此异常
 * 继承自Exception，调用者必须处理或声明抛出此异常
 */
public class AgeIllegalException extends Exception {
    /**
     * 构造方法
     * @param message 异常信息描述
     */
    public AgeIllegalException(String message) {
        super(message);  // 调用父类构造方法传递异常信息
    }
}

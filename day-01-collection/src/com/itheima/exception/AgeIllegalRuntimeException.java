package com.itheima.exception;

/**
 * 年龄非法运行时异常类（非受检异常）
 * 当用户输入的年龄不在合法范围（1-120）时抛出此异常
 * 继承自RuntimeException，调用者可以选择性处理此异常
 */
public class AgeIllegalRuntimeException extends RuntimeException {
    /**
     * 构造方法
     * @param message 异常信息描述
     */
    public AgeIllegalRuntimeException(String message) {
        super(message);  // 调用父类构造方法传递异常信息
    }
}

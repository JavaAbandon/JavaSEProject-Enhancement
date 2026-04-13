package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static StarService createProxy(Star star){
        StarService proxy = (StarService)Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),// 用于执行用哪个类加载器去加载生成的代理类
                star.getClass().getInterfaces(),// 获取类实现的接口
                new InvocationHandler(){// 创建代理对象，并设置处理类
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 用来声明代理对象要处理的事情
                        //参数一：proxy接收到的代理对象本身；参数二：method 当前正在执行的方法；参数三：args当前执行方法所需要的参数
                        String name = method.getName();
                        if ("sing".equals(name)) {
                            System.out.println("准备话筒，结算出场费20w");
                        } else if ("dance".equals(name)) {
                            System.out.println("准备舞台,结算出场费25w");
                        }
                        // 找真正的对象执行方法
                        Object result = method.invoke(star, args);
                        return result;
                    }
                }
        );
        return  proxy;
    }
}

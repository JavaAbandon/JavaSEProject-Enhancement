package com.itheima.proxy.demo;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    @SuppressWarnings("unchecked")
    public static <T> T creatProxy(T service) {
        return (T) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                (_, method, args) -> {
                    long start = System.currentTimeMillis();
                    Object result = method.invoke(service, args);
                    long end = System.currentTimeMillis();
                    System.out.println(method.getName()+"耗时：" + (end - start)/1000.0 + "秒");
                    return result;
                });
    }
}

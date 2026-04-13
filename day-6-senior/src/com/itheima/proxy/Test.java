package com.itheima.proxy;

public class Test {
    public static void main(String[] args) {
        Star star = new Star("鞠婧祎");
        StarService proxy = (StarService) ProxyUtil.createProxy(star);
        proxy.sing("《落日未眠》");
        System.out.println(proxy.dance());
    }

}

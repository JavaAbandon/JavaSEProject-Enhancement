package com.itheima.collection;

/**
 * 测试类 - 电影管理系统入口
 * 创建MovieService对象并启动系统
 */
public class Test {
    public static void main(String[] args) {
        // 创建电影服务对象
        MovieService movieService = new MovieService();
        // 启动电影管理系统
        movieService.start();
    }
}

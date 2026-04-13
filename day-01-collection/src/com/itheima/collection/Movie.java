package com.itheima.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 电影实体类
 * 用于封装电影的基本信息，包括名称、评分、演员和价格
 * 使用Lombok注解简化getter/setter、构造方法等代码
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    // 电影名称
    private String name;
    // 电影评分（满分10分）
    private double score;
    // 主演演员
    private String actor;
    // 电影票价
    private double price;
}

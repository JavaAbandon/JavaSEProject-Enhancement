package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 扑克牌类
 * 表示一张扑克牌，包含大小、花色和数值信息
 * 使用Lombok注解简化代码
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    // 牌的大小（如：3、4、5...J、Q、K、A、2）
    private String size;
    // 牌的花色（♥、♠、♣、♦）
    private String color;
    // 牌的数值（用于排序比较）
    int num ;

    /**
     * 重写toString方法，返回牌的字符串表示
     * @return 牌的大小和花色的组合字符串
     */
    @Override
    public String toString() {
        return size + color;
    }
}

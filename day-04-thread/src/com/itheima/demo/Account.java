package com.itheima.demo;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    public void draw(double money) {
        // 拿到当前谁来取钱
        String name = Thread.currentThread().getName();
        synchronized (this) {
            // 判断余额是否充足
            if (this.money >= money) {
                System.out.println(name + "取钱成功，吐出了：" + this.money+ "元");
                this.money -= money;
                System.out.println("余额为：" + this.money);
            }else{
                System.out.println(name + "取钱失败，余额不足");
            }
        }

    }
}

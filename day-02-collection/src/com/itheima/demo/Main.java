package com.itheima.demo;

/**
 * 斗地主游戏主程序入口
 * 创建房间对象并启动游戏
 */
public class Main {
    public static void main(String[] args) {
        // 创建游戏房间对象
        Room room = new Room();
        // 启动游戏，开始发牌
        room.start();
    }
}
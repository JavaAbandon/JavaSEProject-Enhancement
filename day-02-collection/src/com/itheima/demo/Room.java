package com.itheima.demo;

import java.util.*;

/**
 * 游戏房间类
 * 实现斗地主游戏的发牌逻辑，包括创建牌组、洗牌、发牌和理牌
 */
public class Room {
    // 存储54张扑克牌的列表
    private final List< Card> cards = new ArrayList<>();
    
    // 初始化代码块：创建完整的扑克牌组
    {
        // 定义四种花色
        String[] colors = {"♥","♠","♣","♦"};
        // 定义13个点数，从小到大排列
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int count = 0;
        // 遍历点数和花色，生成52张普通牌
        for (String num : nums) {
            count++;
            for (String color : colors) {
                cards.add(new Card(num,color, count));
            }
        }
        // 添加小王和大王
        cards.add(new Card("","小王",++ count));
        cards.add(new Card("","大王",++ count
        ));
        System.out.println("新牌是" + cards);
    }
    /**
     * 启动游戏：洗牌、发牌、理牌
     * 1. 打乱牌组顺序
     * 2. 给三个玩家发牌，每人17张，留3张底牌
     * 3. 对玩家的牌进行排序并显示
     */
    public void start() {
        // 使用Collections工具类打乱牌的顺序
        Collections.shuffle(cards);
        System.out.println("洗牌后是" + cards);

        // 创建HashMap存储三个玩家的牌
        Map<String, List<Card>> players = new HashMap<>();
        // 玩家1的牌列表
        List<Card> player1 =  new ArrayList<>();
        players.put("玩家1", player1);
        // 玩家2的牌列表
        List<Card> player2 =  new ArrayList<>();
        players.put("玩家2", player2);
        // 玩家3的牌列表
        List<Card> player3 =  new ArrayList<>();
        players.put("玩家3", player3);

        // 发牌逻辑：遍历前51张牌（留3张底牌），轮流发给三个玩家
        for (int i = 0; i < cards.size()-3; i++) {
            Card card = cards.get(i);
            if (i % 3 == 0) {
                player1.add(card);  // 第1、4、7...张牌给玩家1
            } else if (i % 3 == 1) {
                player2.add(card);  // 第2、5、8...张牌给玩家2
            } else {
                player3.add(card);  // 第3、6、9...张牌给玩家3
            }
        }
        // 对玩家1的牌进行排序
        sortCards(player1);
        // 遍历Map，打印每个玩家的牌
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            String name = entry.getKey();
            List<Card> cards = entry.getValue();
            System.out.println(name + ":" + cards);
        }

    }

    /**
     * 对玩家的牌进行排序
     * 按照牌的数值从大到小排序（降序）
     * @param cards 要排序的牌列表
     */
    private void sortCards(List<Card> cards) {
       // 使用Lambda表达式定义比较器，按num字段降序排列
       cards.sort((o1, o2) -> o2.getNum() - o1.getNum());


    }
}

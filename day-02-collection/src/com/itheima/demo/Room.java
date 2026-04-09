package com.itheima.demo;

import java.util.*;

public class Room {
    private final List< Card> cards = new ArrayList<>();
    {
        String[] colors = {"♥","♠","♣","♦"};
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int count = 0;
        for (String num : nums) {
            count++;
            for (String color : colors) {
                cards.add(new Card(num,color, count));
            }
        }
        cards.add(new Card("","小王",++ count));
        cards.add(new Card("","大王",++ count
        ));
        System.out.println("新牌是" + cards);
    }
    public void start() {
        Collections.shuffle(cards);
        System.out.println("洗牌后是" + cards);

        Map<String, List<Card>> players = new HashMap<>();
        List<Card> player1 =  new ArrayList<>();
        players.put("玩家1", player1);
        List<Card> player2 =  new ArrayList<>();
        players.put("玩家2", player2);
        List<Card> player3 =  new ArrayList<>();
        players.put("玩家3", player3);

        for (int i = 0; i < cards.size()-3; i++) {
            Card card = cards.get(i);
            if (i % 3 == 0) {
                player1.add(card);
            } else if (i % 3 == 1) {
                player2.add(card);
            } else {
                player3.add(card);
            }
        }
        sortCards(player1);
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            String name = entry.getKey();
            List<Card> cards = entry.getValue();
            System.out.println(name + ":" + cards);
        }

    }

    private void sortCards(List<Card> cards) {
       cards.sort((o1, o2) -> o2.getNum() - o1.getNum());


    }
}

package com.itheima.generic;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {

    /**
     * 斗地主 将54张牌孙旭打乱然后将每张牌发放到三个玩家中
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 准备牌
         */
        ArrayList<String> pokerbox = new ArrayList<>();
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            number.add(String.valueOf(i));
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");

        color.add("♥");
        color.add("♦");
        color.add("♠");
        color.add("♣");

        for (String s : color) {
            for (String s1 : number) {
                pokerbox.add(s + s1);
            }
        }

        pokerbox.add("大王");
        pokerbox.add("小王");

        //打乱牌的顺序
        Collections.shuffle(pokerbox);
        //准备玩家
        ArrayList<String> person1 = new ArrayList<>();
        ArrayList<String> person2 = new ArrayList<>();
        ArrayList<String> person3 = new ArrayList<>();

        //底牌
        ArrayList<String> pokerDown = new ArrayList<>();

        for (int i = 1; i <= pokerbox.size() - 3; i ++) {
            if ( i%3 == 1) {
                person1.add(pokerbox.get(i - 1));
            }
            if ( i%3 == 2) {
                person2.add(pokerbox.get(i - 1));
            }
            if ( i%3 == 0) {
                person3.add(pokerbox.get(i - 1));
            }
        }

        for (int i = 52; i <= 54; i++) {
            pokerDown.add(pokerbox.get(i - 1));
        }

        System.out.println("person1 : " + person1);
        System.out.println("person2 : " + person2);
        System.out.println("person3 : " + person3);
        System.out.println("pokerDown : " + pokerDown);
    }
}
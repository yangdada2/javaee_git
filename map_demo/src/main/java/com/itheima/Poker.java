package com.itheima;

import java.util.*;

/**
 * 模拟斗地主:
 *          1. 准备牌：
                完成数字与纸牌的映射关系：
                使用双列Map(HashMap)集合，完成一个数字与字符串纸牌的对应关系(相当于一个字典)。
            2. 洗牌：
                通过数字完成洗牌发牌
            3. 发牌：
                将每个人以及底牌设计为ArrayList,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
                存放的过程中要求数字大小与斗地主规则的大小对应。
                将代表不同纸牌的数字分配给不同的玩家与底牌。
            4. 看牌：
                通过Map集合找到对应字符展示。
                通过查询纸牌与数字的对应关系，由数字转成纸牌字符串再进行展示。
 */
public class Poker {
    public static void main(String[] args) {
        /**
         * 组装成一幅54张得牌
         */
        HashMap<Integer, String> map = new HashMap<>();

        //组装牌的集合
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> num = new ArrayList<>();
        for (int j = 3; j<=10 ; j++) {
            num.add(String.valueOf(j));
        }
        num.add("J");
        num.add("Q");
        num.add("K");
        num.add("A");
        num.add("2");
        num.add("小王");
        num.add("大王");
        color.add("♠");
        color.add("♣");
        color.add("♦");
        color.add("♥");
        int i = 1;
        for (int j = 0; j < num.size(); j++) {
            if (j < num.size() -2){
                for (String s : color) {
                    map.put(i++,s+num.get(j));
                }
            }else {
                map.put(i++,num.get(j));
            }
        }
        System.out.println(map);


        //取出编号
        Set<Integer> set = map.keySet();
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : set) {
            list.add(integer);
        }
        //打乱孙旭
        Collections.shuffle(list);

        //3 创建三个玩家
        ArrayList<Integer> person1 = new ArrayList<>();
        ArrayList<Integer> person2 = new ArrayList<>();
        ArrayList<Integer> person3 = new ArrayList<>();
        ArrayList<Integer> downPoker = new ArrayList<>();

        for (int j = 0; j < list.size(); j++) {
            Integer integer = list.get(j);
            //发牌
            if (j < list.size() - 3) {
                if (j%3 == 0) {
                    person1.add(integer);
                }
                if (j%3 == 1) {
                    person2.add(integer);
                }
                if (j%3 == 2) {
                    person3.add(integer);
                }
            }else {
                downPoker.add(integer);
            }
        }
        //4 对手中的牌进行排序
        Collections.sort(person1);
        Collections.sort(person2);
        Collections.sort(person3);


        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (Integer integer1 : person1) {
            String s = map.get(integer1);
            player1.add(s);
        }

        for (Integer integer1 : person2) {
            String s = map.get(integer1);
            player2.add(s);
        }

        for (Integer integer1 : person3) {
            String s = map.get(integer1);
            player3.add(s);
        }

        for (Integer integer1 : downPoker) {
            String s = map.get(integer1);
            dipai.add(s);
        }

        //查看牌
        System.out.println("令狐冲："+player1);
        System.out.println("石破天："+player2);
        System.out.println("鸠摩智："+player3);
        System.out.println("底牌："+dipai);
    }
}

package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Map练习
 *      需求: 计算一个字符串中每个字符出现的次数
 */
public class MapTest {
    public static void main(String[] args) {
        System.out.println("请写出所需要计算的字符串");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        HashMap<String, Integer> map = new HashMap<>();
        if (s != null && s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                String s1 = String.valueOf(c);
                if (map.get(s1) == null) {
                    map.put(s1,1);
                }else{
                    Integer i1 = map.get(s1);
                    //count++;  先执行存入对象然后再 进行自增  ++count 先执行自增 然后再存入对象中
                    //再次存入 更新
                    map.put(s1,++ i1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("字符 : " + entry.getKey() + ", 出现了 : " + entry.getValue() + "次");
        }
    }
}

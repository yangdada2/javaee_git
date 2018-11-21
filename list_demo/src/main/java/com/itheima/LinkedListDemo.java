package com.itheima;

import java.util.LinkedList;

/**
 * 集合数据存储的结构是链表结构。方便元素添加、删除的集合。
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //添加元素
        list.addFirst("abc1");
        list.addFirst("abc2");
        list.addFirst("abc3");
        list.addFirst("abc4");
        list.addFirst("abc5");

        System.out.println(list);

        //获取元素
        //获取第一个元素
        System.out.println(list.getFirst());
        //获取第二个元素
        System.out.println(list.getLast());
        //删除元素
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        //判断集合是否为空
        while(!list.isEmpty()) {
            //进行弹栈,弹出去过后元素就已经不在了
            System.out.println(list.pop());
        }

        System.out.println(list);
    }
}

package com.itheima;

public class Demo {
    public static void main(String[] args) {
        System.out.println("这是是一个main线程");
        MyThread thread = new MyThread("小强");
        thread.run(); //开启了一个新的线程
        for (int i = 0; i <= 20; i++) {
            System.out.println("旺财 : " + i);
        }
    }
}

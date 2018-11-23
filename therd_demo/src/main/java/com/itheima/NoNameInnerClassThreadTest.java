package com.itheima;

public class NoNameInnerClassThreadTest {
    public static void main(String[] args) {
        //创建线程任务
        Ticket2 ticket = new Ticket2();

        //创建三个窗口对象
        Thread t1 = new Thread(ticket,"窗口一");
        Thread t2 = new Thread(ticket,"窗口二");
        Thread t3 = new Thread(ticket,"窗口三");

        //同时卖票
        t1.start();
        t2.start();
        t3.start();
    }
}

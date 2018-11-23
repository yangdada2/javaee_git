package com.itheima;


/**
 * Timed Waiting : 计时等待
 *               一个正在限时等待另一个线程执行一个(唤醒操作)动作的线程处于这一状态.
 */
public class MyThreadWaiting implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("------------" + i);
            }
            System.out.println(i);
            try {
                Thread.sleep(1000);
                System.out.println("    线程睡眠1秒! \n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyThreadWaiting().run();
    }
}

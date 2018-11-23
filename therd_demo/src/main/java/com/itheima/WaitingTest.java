package com.itheima;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Waiting 无限等待
 */
public class WaitingTest {
    public static Object obj = new Object();

    public static void main(String[] args) {
        //演示waiting
        new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized (obj) {
                            System.out.println(Thread.currentThread().getName() + "===获取到所对象,调用wait方法,进入waiting状态,释放锁对象");
                            obj.wait(); //无线等待
                            //obj.wait(5000)  计时等待, 5s时间到一到 自动醒来
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "===从waiting状态醒来,获取到锁对象,继续执行了");
                }
            }
        },"等待线程").start();


        /**
         * 用于唤醒线程
         */
        new Thread(new Runnable() {
            public void run() {
                try {
                    //每隔3秒唤醒一次
                    System.out.println(Thread.currentThread().getName() + "---等待3秒");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //使用synchronized同步锁
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + "----获取到锁对象,调用notify方法,释放锁对象");
                    //唤醒线程
                    obj.notify();
                }
            }
        },"唤醒线程").start();
    }
}

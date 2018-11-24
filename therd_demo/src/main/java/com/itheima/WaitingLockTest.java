package com.itheima;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * 除了wait和notify()协作完成线程同步之外,Lock也可以完成同样的目的
 */
public class WaitingLockTest {

    public static Object obj = new Object();

    private static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        //演示waiting
        new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        lock.lock();
                        System.out.println(Thread.currentThread().getName() + "===获取到所对象,调用wait方法,进入waiting状态,释放锁对象");
                        obj.wait(); //无线等待
                        //obj.wait(5000)  计时等待, 5s时间到一到 自动醒来
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        //主动释放锁,如果说不主动释放锁如果报错的话容易赵成死锁
                        //所以说使用lock 释放锁就必须要在finally中
                        lock.unlock();
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

                //使用ReentrantLock同步锁

                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "----获取到锁对象,调用notify方法,释放锁对象");
                    obj.notify();  //唤醒线程
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        },"唤醒线程").start();
    }
}

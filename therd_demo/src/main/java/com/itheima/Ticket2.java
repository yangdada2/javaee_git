package com.itheima;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock锁:
 *          Lock机制提供了比synchronized代码块和synchronized方法更加广泛的锁定操作,同步代码块
 *          /同步方法具有的功能Lock都有,除此之外更强大,更体现面向对象
 */
public class Ticket2 implements Runnable{

    private int ticket = 100;
    //创建对象
    Lock lock = new ReentrantLock();

    public void run() {
        while(true) {

            //上锁
            lock.lock();
            if(ticket>0){//有票 可以卖
                //出票操作
                //使用sleep模拟一下出票时间
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    // TODO Auto‐generated catch block
                    e.printStackTrace();
                }
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name+"正在卖:"+ticket--);
            }

            //解锁
            lock.unlock();
        }
    }
}

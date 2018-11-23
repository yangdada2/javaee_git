package com.itheima;


/**
 * 线程安全:
 *          如果有多个线程在同时运行, 而这些线程可能会同时运行这段代码,程序每次运行的结果和单线程运行的结果一样的
 *          ,而且其他的变量的值也和预期的是一样的,那么线程也是安全的; 反之则是不安全的;
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    /**
     * 表示该对象
     */
    Object lock = new Object();
    /**
     * 模拟卖票过程
     */
    public void run() {
        //每个窗口的卖票过程
        //窗口永远开启
        while(true) {

            /**
             * 为了保证线程安全我们的使用同步锁synchronized
             * 使用同步锁 : 对象的同步锁只是一个概念,可以想象为在一个对象上标记了一个锁
             *                      1.锁对象可以是任意类型
             *                      2.多个线程对象,要使用同一个锁
             */
            synchronized (lock){
                if (ticket > 0) {   //有票可以出售
                    //使用sleep模拟一下出票时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //获取当前线程对象的名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖 : " + ticket--);
                }
            }
        }
    }
}

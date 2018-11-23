package com.itheima;

/**
 * 同步方法:
 *          使用synchronized修饰的方法,就叫做同步方法,保证A线程执行该方法的时候,其他线程只能在方法外等着
 */
public class Ticket1 implements Runnable {

    private int ticket = 100;
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while(true){
            sellTicket();
        }
    }

    private synchronized void sellTicket() {
        if(ticket>0) {//有票 可以卖
            //出票操作
            //使用sleep模拟一下出票时间
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto‐generated catch block
                e.printStackTrace();
            }
            //获取当前线程的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖 : " + ticket--);
        }
    }
}

package com.itheima.domain;

/**
 * 线程消费者
 */
public class ChiHuo extends Thread {
    private BaoZi baoZi;

    public ChiHuo(String name, BaoZi bz) {
        super(name);
        this.baoZi = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                //包子铺每包子进行线程等待
                if (baoZi.flag == false) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃" + baoZi.pier + baoZi.xianer + "包子");
                //吃货把包子吃完了设置状态为false
                baoZi.flag = false;
                //唤醒包子铺制造包子
                baoZi.notify();
            }
        }
    }
}

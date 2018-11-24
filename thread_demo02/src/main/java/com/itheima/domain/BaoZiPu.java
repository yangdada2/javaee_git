package com.itheima.domain;

public class BaoZiPu extends Thread {

    private BaoZi bz;

    public BaoZiPu(String name , BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    public void run() {
        int count = 0;

        //造包子
        while(true) {
            synchronized (bz) {
                //假如包子还有 就不进行生产
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //没有包子造包子
                System.out.println("包子铺开始做包子");
                if (count%2 == 0) {
                    bz.pier = "冰皮";
                    bz.xianer = "五仁";
                }else {
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }

                count++;

                bz.flag = true;
                System.out.println("包子造好了 ; " + bz.pier + bz.xianer);
                System.out.println("吃货来吃吧");

                //唤醒等待线程
                bz.notify();
            }
        }
    }
}

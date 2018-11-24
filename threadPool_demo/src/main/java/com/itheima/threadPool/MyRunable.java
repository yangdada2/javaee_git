package com.itheima.threadPool;


/**
 * 线程池 : 其实就是一个容纳多个线程的容器,其中的线程会反复使用,省去了频繁创建线程对象的操作
 * 无需反复创建线程而消耗资源
 *
 * 合理利用线程池能够带来的好处:
 *              1.降低资源消耗
 *              2.提供相应速度. 当任务到达时,任务可以不需要的等到线程创建就能立即执行;
 *              3.提高线程的可管理性: 可以根据系统的承受能力,调整线程池中工作线程的数目,防止因为消耗过多
 *                  内存, 而把服务器累趴下.
 */
public class MyRunable implements Runnable {

    /**
     * 测试频繁创建线程和销毁线程会对资源造成大大的浪费
     */
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("教练来了 : " + Thread.currentThread().getName());
        System.out.println("叫我游泳,交完后, 教练回到了泳池当中");
    }
}

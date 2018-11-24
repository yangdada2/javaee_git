package com.itheima.domain;


/**
 * 等待唤醒机制:
 *              其实就是经典的"生产者和消费者问题"的问题
 *
 * 调用wait和notify方法需要注意的细节
 *              1.wait方法与notify方法必须要由同一个锁对象调用,因为:对应的锁对象可以通过notify
 *                唤醒使用同一个锁对象调用的wait方法后的线程.
 *              2. wait方法与notify方法是属于Object类方法的, 因为 : 锁对象可以使任意对象,而任意的
 *                  对象锁都是继承了Object类
 *              3. wait方法与notify方法必须要在同步代码块中执行或者是同步函数中使用. 因为:必须要通过
 *                  锁对象调用这两个方法;
 *
 * 等待唤醒中的方法:
 *              1. wait：线程不再活动，不再参与调度，进入 wait set 中，因此不会浪费 CPU 资源，也不会去竞争锁了，这时
                    的线程状态即是 WAITING。它还要执行一个特别的动作，也即是“通知（notify）”在这个对象上等待的线程
                    从wait set 中释放出来，重新进入到调度队列（ready queue）中
                2. notify：则选取所通知对象的 wait set 中的一个线程释放；例如，餐馆有空位置后，等候就餐最久的顾客最先
                    入座。
                3. notifyAll：则释放所通知对象的 wait set 上的全部线程

 *什么是等待唤醒机制:
 *              这是多个线程之间的一种协作关系.我们经常想到线程之间的竞争,比如去争夺锁,但这并不是故事的全部,线程之间也有
 *              协作关系, 就是在一个线程进行了规定操作过后,就进入了等待状态,等待其他线程执行完他们制定代码后,再将其唤醒;
 *              在有多个线程在等待时,如果需要,可以使用notifyAll()来唤醒所有等待的线程, wait()和motify()就是线程之间的一种
 *              协作机制.
 */
public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();

        ChiHuo chiHuo = new ChiHuo("吃货", baoZi);

        BaoZiPu baoZiPu = new BaoZiPu("包子铺", baoZi);

        chiHuo.start();
        baoZiPu.start();
    }
}

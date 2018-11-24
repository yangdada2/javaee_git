package com.itheima.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2); //包含两个线程

        //创建Runnble实例对象
        MyRunable runable = new MyRunable();

        //从线程池中获取到线程对象
        service.submit(runable);

        //再从线程池中获取到线程对象
        service.submit(runable);
        service.submit(runable);
        //注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
        //将使用完的线程又归还到了线程池中
        // 关闭线程池
        //service.shutdown();
    }
}

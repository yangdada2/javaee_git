package com.itheima;


/*
    1. 定义Runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线程执行体。
    2. 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正
    的线程对象。
    3. 调用线程对象的start()方法来启动线程。
 */
public class MyRunnableTest {

    /**
     * 通过实现Runnable借口,使得该类有了多线程的特征,run()方法是多线程的执行的第一个目标.所有的多线程代码都在run方法里面
     * Thread类实际上也是实现了Runnable借口的类
     * 在启动的多线程的时候,需要先通过Thread类的构造方法Thread(Runnable target)构造出对象,然后调用Thread对象
     * 的start()方法来运行多线程
     * 实际上所有的多线程代码都是通过运行Tread的start()方法来运行的, 因此, 不管继承Thread类还是实现Runnable接口来实现多
     * 线程,最终还是通过Thread的对象的API来控制线程的,熟悉Thread类的API是进行多线程编程的基础.
     *
     * Thread和Runable的区别:
     *                      实现Runnable接口比继承Thread类所具有的优势.
     *                              1.适合多个相同的程序代码去共享同一资源.
     *                              2.可以避免java中的单继承的局限性.
     *                              3.增加程序的健壮性,实现解耦操作,代码可以被多个线程所共享, 代码和线程的独立.
     *                              4.线程池中只能放入实现Runnable或Callable类的线程,不能直接放入继承Tread的类.
     * @param args
     */
    public static void main(String[] args) {
        //创建自定义类对象 线程任务对象
        MyRunnable myRunnable = new MyRunnable();
        //创建线程对象
        Thread thread = new Thread(myRunnable, "小强");
        thread.start();
        for (int i = 0; i <= 20; i++) {
            System.out.println("旺财 : " + i);
        }
    }
}

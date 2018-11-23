package com.itheima;


/**
 * 匿名内部类方式实现线程的创建
 */
public class NoNameInnerClassThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 0; i <= 20; i++) {
                    System.out.println("张三 : " + i);
                }
            }
        };

        new Thread(runnable).start();

        for (int i = 0; i <= 20; i++) {
            System.out.println("李四 : " + i);
        }
    }
}

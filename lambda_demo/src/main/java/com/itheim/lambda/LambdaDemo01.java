package com.itheim.lambda;


/**
 * lambda表达式的内容如下
 *              Thread 类需要Runnable 接口作为参数，其中的抽象run 方法是用来指定线程任务内容的核心；
                为了指定run 的方法体，不得不需要Runnable 接口的实现类；
                为了省去定义一个RunnableImpl 实现类的麻烦，不得不使用匿名内部类；
                必须覆盖重写抽象run 方法，所以方法名称、方法参数、方法返回值不得不再写一遍，且不能写错；
                而实际上，似乎只有方法体才是关键所在。
 */
public class LambdaDemo01 {
    public static void main(String[] args) {

        /**
         * 匿名内部类的写法
         */
        new Thread(new Runnable() {
            public void run() {
                System.out.println("多线程任务执行");
            }
        }).start();


        /**
         * lambda表达式的写法 , 只有在JDK1.8下面才能这样写, 所以说lambda表达式也是JDK1.8的新特性
         */
        new Thread(() -> System.out.println("多线程任务执行2")).start();
    }
}

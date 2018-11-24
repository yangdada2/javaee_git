package com.itheim.lambda;

public class LambdaDemo02 {
    /**
     * 匿名内部类的好处与弊端
     *              1.一方面,匿名内部类可以帮助我们省去实现类的定义,
     *              2. 弊端是匿名内部类的语法实在是太复杂了
     *
     *              匿名内部类的构造:
     *                  无参数,
     *                  无返回值
     *                  代码块
     *
     * lambda的标准格式
     *              (参数类型, 参数名称) -> {代码语句}
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 演示午餐无返回值的情况lambda表达式的书写
         */
        invokeCook(() -> {
            System.out.println("厨子把饭菜都整理好了, 来吃饭吧!!!!");
        });
    }


    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}

package com.itheim.lambda;

/**
 * Lambda表达式的省略格式的书写的规则:
 *                      1. 小括号内参数的类型可以省略；
                        2. 如果小括号内有且仅有一个参，则小括号可以省略；
                        3. 如果大括号内有且仅有一个语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。

 * Lambda表达式的使用前提:
 *          1.使用Lambda必须是接口,且要求接口中有且仅有一个抽象方法
 *          2.使用Lambda必须具有上下文推断
 */
public class LambdaDemo05 {
    /**
     * 使用厨子来书写省略Lambda表达式
     * @param args
     */
    public static void main(String[] args) {
        invokeCook(() -> System.out.println("吃饭啦"));
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}

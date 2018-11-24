package com.itheim.lambda;

/**
 * 使用lambda表达式来 对有参有返回值的书写
 */
public class LambdaDemo04 {

    public static void main(String[] args) {
        invokeCalc(2,10,(int a, int b) -> {
            return a + b;
        });
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}

package com.itheima.recursive;

/**
 * 求1到10的阶乘
 */
public class RecursiveDemo02 {
    public static void main(String[] args) {
        int num = 10;
        int value = getValue(num);

        System.out.println(value);
    }

    private static int getValue(int num) {

        if (num == 1 || num == 0) {
            return num;
        }

        return num * (getValue(num -1));
    }
}

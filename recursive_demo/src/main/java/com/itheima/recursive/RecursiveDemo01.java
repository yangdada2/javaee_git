package com.itheima.recursive;

/**
 * 递归:
 *      计算1~n的和
 */
public class RecursiveDemo01 {
    public static void main(String[] args) {
        //计算1到num的和使用递归完成
        int num = 5;
        //调用求和的方法
        int sum = getSum(num);

        System.out.println(sum);
    }

    private static int getSum(int num) {
        /**
         * num为1的时候方法返回为1
         * 相当于方法的出口
         */
        if (num <= 1) {
            return num;
        }

        /**
         * num不为1时,方法返回num + (num -1)的累和
         * 递归调用getSum的方法
         */
        return num + getSum(num - 1);
    }
}

package com.itheima.system;

public class SystemDemo02 {
    /**
     * arraycopy方法
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int[] ints1 = {6,7,8,9,10};
        System.arraycopy(ints,0,ints1,0,3);
        /*代码运行后：两个数组中的元素发生了变化
        src数组元素[1,2,3,4,5]
        dest数组元素[1,2,3,9,10]
        */
        for (int anInt : ints) {
            System.out.println("ints : " + anInt);
        }

        for (int i : ints1) {
            System.out.println("ints1 : " + i);
        }

    }
}

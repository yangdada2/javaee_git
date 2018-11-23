package com.itheima.utils;

public class ArrayTools {

    public static int getElement(int[] arr, int index) {

        /**
         * 使用自定义异常进行抛出
         */
        //throw new 异常类名(参数);
        if (index < 0 || index > arr.length) {
            throw new RuntimeException("兄弟你输入的索引越界了");
        }

        if (arr.length < 0 || arr == null) {
            throw new RuntimeException("兄弟你要访问的数组为null");
        }

        int element = arr[index];
        return element;
    }
}

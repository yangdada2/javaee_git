package com.itheima.utils;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int element = ArrayTools.getElement(arr, 4);
        System.out.println(element);
        System.out.println("over");
    }
}

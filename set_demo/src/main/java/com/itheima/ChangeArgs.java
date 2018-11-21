package com.itheima;

public class ChangeArgs {
    public static void main(String[] args) {
        int [] arr = {1,4,62,213,321};
        int [] arr1 = {};
        //求这几个元素的和
        int sum = getSum(arr);
        getSum(arr1);
        System.out.println(sum);
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        if (arr.length > 0 && arr != null) {
            for (int i : arr) {
                sum += i;
            }
        }else {
            throw new RuntimeException("该数组为空或者为null");
        }
        return sum;
    }
}

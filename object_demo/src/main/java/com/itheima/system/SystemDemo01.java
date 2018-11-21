package com.itheima.system;

public class SystemDemo01 {
    /**
     * 记录打印从1到9999所需要的毫秒值
     * @param args
     */
    public static void main(String[] args) {
        Long i1 = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        Long i2 = System.currentTimeMillis();

        System.out.println(i2 - i1);
    }
}

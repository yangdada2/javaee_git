package com.itheima.generic;

public class GenericMethodDemo {

    /**
     * 带哟偶泛型的方法测试
     * @param args
     */
    public static void main(String[] args) {
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        myGenericMethod.show("abcd");
        String abcd = myGenericMethod.show2("abcd");
        System.out.println(abcd);
    }
}

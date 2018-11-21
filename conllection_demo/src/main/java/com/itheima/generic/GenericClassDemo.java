package com.itheima.generic;

public class GenericClassDemo {
    public static void main(String[] args) {
        MyGenericClass<String> stringMyGenericClass = new MyGenericClass<>();
        stringMyGenericClass.setMvp("社会你杨大大");
        String mvp = stringMyGenericClass.getMvp();
        System.out.println(mvp);
    }
}

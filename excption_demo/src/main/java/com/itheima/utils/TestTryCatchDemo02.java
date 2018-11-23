package com.itheima.utils;

public class TestTryCatchDemo02 {

    //模拟数据库中的数据
    private static String[] names = {"zs","ls","ww"};

    public static void main(String[] args) {
        //调用方法
        //可能出现异常
        try {
            boolean b = checkUsername("ls");
            //如果不抛出异常
            System.out.println("注册成功");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkUsername(String name) throws LoginException {
        for (String s : names) {
            //如果名字在这里面就抛出异常
            if (name.equals(s)) {
                throw new LoginException("该名字" + name + "已被注册");
            }
        }
        return true;
    }
}

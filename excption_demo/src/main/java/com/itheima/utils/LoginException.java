package com.itheima.utils;


/**
 * 业务逻辑异常, 使用登录的案例来表示, 这个需要继承exception这个父类
 */
public class LoginException extends Exception {
    //空参构造
    public LoginException() {
    }


    /**
     *
     * @param message  表示异常提示
     */
    public LoginException(String message) {
        super(message);
    }
}

package com.eshare.uflo.example;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname RequestHolder
 * @Date 2019/1/9 9:21
 * @Created by jianjieming
 */
public class RequestHolder {

    private static final ThreadLocal<HttpServletRequest> threadLocal = new ThreadLocal<>();

    public static void setThreadLocal(HttpServletRequest req) {
        threadLocal.set(req);
    }

    public static HttpServletRequest getThreadLocal() {
        return threadLocal.get();
    }

    public static void remove() {
        threadLocal.remove();
    }

}

package com.example.demo.dc.design.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author duanchao
 * @CreateDate: 2019/7/9 0009 10:29
 */
public class DynamicProxy implements InvocationHandler {

    private  Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}

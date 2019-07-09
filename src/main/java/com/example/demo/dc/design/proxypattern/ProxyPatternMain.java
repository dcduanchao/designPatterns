package com.example.demo.dc.design.proxypattern;

import com.example.demo.dc.design.proxypattern.dynamicproxy.DynamicProxy;
import com.example.demo.dc.design.proxypattern.staticproxy.StaticByProxyClass;
import com.example.demo.dc.design.proxypattern.staticproxy.StaticProxy;
import com.example.demo.dc.design.proxypattern.staticproxy.StaticProxyClass;

import java.lang.reflect.Proxy;

/**
 * @author duanchao
 * @CreateDate: 2019/7/9 0009 09:57
 *
 * 代理模式
 */
public class ProxyPatternMain {

    public static void main(String[] args) {
        //静态代理
        StaticProxyClass proxyClass = new StaticProxyClass(new StaticByProxyClass());
        proxyClass.visit();


        //动态代理
        StaticByProxyClass byProxyClass = new StaticByProxyClass();
        DynamicProxy dynamicProxy = new DynamicProxy(byProxyClass);
        ClassLoader classLoader = byProxyClass.getClass().getClassLoader();
         StaticProxy staticProxy= (StaticProxy) Proxy.newProxyInstance(classLoader, new Class[]{StaticProxy.class}, dynamicProxy);
        staticProxy.visit();
    }
}

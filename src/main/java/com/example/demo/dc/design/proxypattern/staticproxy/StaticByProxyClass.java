package com.example.demo.dc.design.proxypattern.staticproxy;

/**
 * @author duanchao
 * @CreateDate: 2019/7/9 0009 10:15
 * 被代理类
 */
public class StaticByProxyClass implements  StaticProxy{
    @Override
    public void visit() {
        System.out.println("被代理类");
    }
}

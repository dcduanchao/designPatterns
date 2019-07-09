package com.example.demo.dc.proxypattern.staticproxy;

/**
 * @author duanchao
 * @CreateDate: 2019/7/9 0009 10:15
 * 代理类
 */
public class StaticProxyClass implements StaticProxy{

    private StaticProxy staticProxy;


    public StaticProxyClass() {
    }

    public StaticProxyClass(StaticProxy staticProxy) {
        this.staticProxy = staticProxy;
    }

    @Override
    public void visit() {
        staticProxy.visit();

    }
}

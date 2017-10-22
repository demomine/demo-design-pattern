package com.lance.demo.pattern.dynamic;

/**
 * Created by immerer on 2017/10/22.
 */
public class DynamicDemo {
    public void proxy() {
        DynamicProxy dynamicProxy = new DynamicProxy(new ProxyImpl());
        IProxy proxy = dynamicProxy.proxy();
        proxy.hell();
    }
}

package com.lance.demo.pattern.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by immerer on 2017/10/22.
 */
public class DynamicProxy {
    private IProxy target;

    public DynamicProxy(IProxy target) {
        this.target = target;
    }
    public IProxy proxy() {
        IProxy proxy = (IProxy) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy1, method, args) -> {
            System.out.println("before proxy");
            Object object = method.invoke(target, args);
            System.out.println("after proxy");
            return object;
        });
        return proxy;
    }
}

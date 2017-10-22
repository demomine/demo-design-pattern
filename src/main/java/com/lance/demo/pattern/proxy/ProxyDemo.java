package com.lance.demo.pattern.proxy;

/**
 * Created by immerer on 2017/10/22.
 */
public class ProxyDemo {
    public void proxy() {
        IProxy proxyImpl = new ProxyImpl();
        IProxy proxy = new Proxy(proxyImpl);

        proxy.hell();
    }
}

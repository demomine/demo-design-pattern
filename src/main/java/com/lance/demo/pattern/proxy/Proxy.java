package com.lance.demo.pattern.proxy;

/**
 * Created by immerer on 2017/10/22.
 */
public class Proxy implements IProxy {
    private IProxy proxy;

    public Proxy(IProxy proxy) {
        this.proxy = proxy;
    }
    @Override
    public void hell() {
        System.out.println("before proxy");
        proxy.hell();
        System.out.println("after proxy");
    }
}

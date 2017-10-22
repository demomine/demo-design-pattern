package com.lance.demo.pattern.proxy;

/**
 * Created by immerer on 2017/10/22.
 */
public class ProxyImpl implements IProxy {
    @Override
    public void hell() {
        System.out.println("hello proxy");
    }
}

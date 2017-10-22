package com.lance.demo.pattern.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by immerer on 2017/10/22.
 */
public class ProxyDemoTest {
    @Test
    public void proxy() throws Exception {
        ProxyDemo proxyDemo = new ProxyDemo();
        proxyDemo.proxy();
    }

}
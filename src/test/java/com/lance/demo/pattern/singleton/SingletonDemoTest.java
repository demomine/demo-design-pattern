package com.lance.demo.pattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonDemoTest {
    private SingletonDemo singletonDemo = new SingletonDemo();

    @Test
    public void hungry() throws Exception {
        singletonDemo.hungry();
    }

    @Test
    public void full() throws Exception {
        singletonDemo.full();
    }

}
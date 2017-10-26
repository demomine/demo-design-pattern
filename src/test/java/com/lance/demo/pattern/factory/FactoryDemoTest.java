package com.lance.demo.pattern.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryDemoTest {
    @Test
    public void product() throws Exception {
        FactoryDemo factoryDemo = new FactoryDemo();
        factoryDemo.product();
    }

}
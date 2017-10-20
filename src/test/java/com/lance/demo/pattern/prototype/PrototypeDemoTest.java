package com.lance.demo.pattern.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrototypeDemoTest {
    @Test
    public void serialDemo() throws Exception {
        PrototypeDemo prototypeDemo = new PrototypeDemo();
        prototypeDemo.serialDemo();
    }

    @Test
    public void cloneDemo() throws Exception {
        PrototypeDemo prototypeDemo = new PrototypeDemo();
        prototypeDemo.cloneDemo();
    }

}
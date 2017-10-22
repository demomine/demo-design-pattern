package com.lance.demo.pattern.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by immerer on 2017/10/22.
 */
public class DynamicDemoTest {
    @Test
    public void proxy() throws Exception {
        DynamicDemo dynamicDemo = new DynamicDemo();
        dynamicDemo.proxy();

    }

}
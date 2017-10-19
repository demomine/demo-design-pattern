package com.lance.demo.pattern.builder2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDemoTest {
    @Test
    public void build() throws Exception {
        ProductDemo productDemo = new ProductDemo();
        productDemo.build();
    }

}
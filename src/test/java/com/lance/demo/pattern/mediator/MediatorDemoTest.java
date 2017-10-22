package com.lance.demo.pattern.mediator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by immerer on 2017/10/22.
 */
public class MediatorDemoTest {
    @Test
    public void mediate() throws Exception {
        MediatorDemo mediatorDemo = new MediatorDemo();
        mediatorDemo.mediate();
    }

}
package com.lance.demo.pattern.visitor;

import org.junit.Test;

/**
 * Created by immerer on 2017/10/20.
 */
public class EastWestDemoTest {
    @Test
    public void visit() throws Exception {
        EastWestDemo eastWestDemo = new EastWestDemo();
        eastWestDemo.visit();
    }

}
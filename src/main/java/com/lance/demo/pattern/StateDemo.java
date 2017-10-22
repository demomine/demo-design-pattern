package com.lance.demo.pattern;

import com.lance.demo.pattern.state.AState;
import com.lance.demo.pattern.state.BState;
import com.lance.demo.pattern.state.Context;
import com.lance.demo.pattern.state.State;

/**
 * Created by immerer on 2017/10/22.
 */
public class StateDemo {
    public void state() {
        State stateA = new AState();

        State stateB = new BState();

        Context contextA = new Context(stateA);
        contextA.request("aaaa");


        Context contextB = new Context(stateB);
        contextB.request("bbbb");
    }
}


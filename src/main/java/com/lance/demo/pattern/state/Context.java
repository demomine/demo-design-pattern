package com.lance.demo.pattern.state;

/**
 * Created by immerer on 2017/10/22.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request(String param) {
        state.handle(param);
    }
}

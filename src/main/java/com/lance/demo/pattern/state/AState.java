package com.lance.demo.pattern.state;

/**
 * Created by immerer on 2017/10/22.
 */
public class AState implements State {
    @Override
    public void handle(String param) {
        System.out.println("A state" + param);
    }
}

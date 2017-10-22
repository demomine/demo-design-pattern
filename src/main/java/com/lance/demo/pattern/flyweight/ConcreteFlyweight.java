package com.lance.demo.pattern.flyweight;

/**
 * Created by immerer on 2017/10/22.
 */
public class ConcreteFlyweight implements Flyweight {
    private String initState;

    public ConcreteFlyweight(String initState) {
        this.initState = initState;
    }
    @Override
    public void operation(String state) {
        System.out.println("init state: "+initState);
        System.out.println("state: "+state);
    }
}

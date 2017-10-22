package com.lance.demo.pattern.composite;

/**
 * Created by immerer on 2017/10/22.
 */
public class FlyweightDemo {

    public void flyweight() {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory("a");
        fly.operation("First Call");

        fly = factory.factory("b");
        fly.operation("Second Call");

        fly = factory.factory("a");
        fly.operation("Third Call");
    }
}

package com.lance.demo.pattern.strategy;

/**
 * Created by immerer on 2017/10/22.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calCount(int count) {
        System.out.println("count:"+count);

        return this.strategy.cal(count);
    }
}

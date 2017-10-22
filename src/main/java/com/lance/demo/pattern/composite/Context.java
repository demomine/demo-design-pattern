package com.lance.demo.pattern.composite;

/**
 * Created by immerer on 2017/10/22.
 */
public class Context {
    private BaseStrategy strategy;

    public Context(BaseStrategy strategy) {
        this.strategy = strategy;
    }

    public int calCount(int countA,int countB) {
        System.out.println("countA:"+countA+" countB:"+countB);

        return this.strategy.cal(countA, countB);
    }
}

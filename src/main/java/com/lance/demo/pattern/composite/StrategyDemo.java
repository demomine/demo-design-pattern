package com.lance.demo.pattern.composite;


/**
 * Created by immerer on 2017/10/22.
 */
public class StrategyDemo {
    public void strategy() {
        BaseStrategy baseStrategy = new SquareAStrategy();

        Context context = new Context(baseStrategy);
        System.out.println(context.calCount(2, 2));

        baseStrategy = new TripleStrategy();
        context = new Context(baseStrategy);
        System.out.println(context.calCount(2,2));
    }
}

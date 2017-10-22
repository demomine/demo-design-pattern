package com.lance.demo.pattern.strategy;

/**
 * Created by immerer on 2017/10/22.
 */
public class StrategyDemo {
    public void strategy() {
        Strategy strategy = new SquareStrategy();
        Context context = new Context(strategy);

        int count = context.calCount(10);
        System.out.println(count);

        Strategy strategyTriple = new TrippleStrategy();
        Context contextTriple = new Context(strategyTriple);

        count = contextTriple.calCount(10);
        System.out.println(count);
    }
}

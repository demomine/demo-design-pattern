package com.lance.demo.pattern.composite;

/**
 * Created by immerer on 2017/10/22.
 */
public abstract class SquareBStrategy implements BaseStrategy {
    @Override
    public int cal(int countA, int countB) {
        return cal(countA) +  countB * countB;
    }

    protected abstract int cal(int countA);
}

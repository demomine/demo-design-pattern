package com.lance.demo.pattern.strategy;

/**
 * Created by immerer on 2017/10/22.
 */
public class SquareStrategy implements Strategy {
    @Override
    public int cal(int count) {
        return count * count;
    }
}

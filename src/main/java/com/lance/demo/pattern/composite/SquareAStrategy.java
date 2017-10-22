package com.lance.demo.pattern.composite;

/**
 * Created by immerer on 2017/10/22.
 */
public class SquareAStrategy extends SquareBStrategy {
    @Override
    protected int cal(int countA) {
        return countA * countA;
    }

}

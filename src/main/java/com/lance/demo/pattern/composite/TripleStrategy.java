package com.lance.demo.pattern.composite;

/**
 * Created by immerer on 2017/10/22.
 */
public class TripleStrategy implements BaseStrategy {
    @Override
    public int cal(int countA,int countB) {
        return countA*countA*countA + countB*countB*countB;
    }
}

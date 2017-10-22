package com.lance.demo.pattern.mainboard;

/**
 * Created by immerer on 2017/10/22.
 */
public abstract class Job {
    protected MainBoard mainBoard;

    public Job(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    protected abstract void jobFinish();
}

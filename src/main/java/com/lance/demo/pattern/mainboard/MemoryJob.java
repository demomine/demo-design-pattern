package com.lance.demo.pattern.mainboard;

/**
 * Created by immerer on 2017/10/22.
 */
public class MemoryJob extends Job {
    public MemoryJob(MainBoard mainBoard) {
        super(mainBoard);
    }

    @Override
    protected void jobFinish() {
        boolean result = mainBoard.doneJob(this);
        if (result) {
            System.out.println("memory continue running");
        } else {
            System.out.println("memory stopped");
        }
    }

    public void work() {
        System.out.println("memory work");
        jobFinish();
    }
}

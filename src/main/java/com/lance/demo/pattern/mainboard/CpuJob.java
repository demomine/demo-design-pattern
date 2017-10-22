package com.lance.demo.pattern.mainboard;

/**
 * Created by immerer on 2017/10/22.
 */
public class CpuJob extends Job{
    public CpuJob(MainBoard mainBoard) {
        super(mainBoard);
    }

    @Override
    protected void jobFinish() {
        boolean result = mainBoard.doneJob(this);
        if (result) {
            System.out.println("cpu continue running");
        } else {
            System.out.println("cpu stopped");
        }

    }

    public void run() {
        System.out.println("cpu begin running");
        jobFinish();
    }
}

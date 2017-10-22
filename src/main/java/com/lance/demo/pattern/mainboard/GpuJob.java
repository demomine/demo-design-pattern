package com.lance.demo.pattern.mainboard;

/**
 * Created by immerer on 2017/10/22.
 */
public class GpuJob extends Job{
    public GpuJob(MainBoard mainBoard) {
        super(mainBoard);
    }

    @Override
    protected void jobFinish() {
        System.out.println("gpu begin running");
        boolean result = mainBoard.doneJob(this);
        if (result) {
            System.out.println("gpu continue running");
        } else {
            System.out.println("gpu stopped");
        }
    }

    public void show() {
        System.out.println("show image");
        jobFinish();
    }
}

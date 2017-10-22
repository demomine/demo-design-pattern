package com.lance.demo.pattern.mainboard;

/**
 * Created by immerer on 2017/10/22.
 */
public class AsusMainBoard implements MainBoard {
    private CpuJob cpuJob;
    private GpuJob gpuJob;
    private MemoryJob memoryJob;

    @Override
    public boolean doneJob(Job job) {
        if (job instanceof CpuJob) {
            memoryJob.work();
        }
        if (job instanceof MemoryJob) {
            gpuJob.show();
        }
        if (job instanceof GpuJob) {
            System.out.println("finish work");
        }
        return true;
    }

    public void start() {
        cpuJob.run();
    }

    public void setCpuJob(CpuJob cpuJob) {
        this.cpuJob = cpuJob;
    }

    public void setGpuJob(GpuJob gpuJob) {
        this.gpuJob = gpuJob;
    }

    public void setMemoryJob(MemoryJob memoryJob) {
        this.memoryJob = memoryJob;
    }
}

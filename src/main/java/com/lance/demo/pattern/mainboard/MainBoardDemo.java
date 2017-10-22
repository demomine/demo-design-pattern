package com.lance.demo.pattern.mainboard;

/**
 * Created by immerer on 2017/10/22.
 */
public class MainBoardDemo {
    public void mainBoard() {
        AsusMainBoard mainBoard = new AsusMainBoard();
        CpuJob cpuJob = new CpuJob(mainBoard);
        GpuJob gpuJob = new GpuJob(mainBoard);
        MemoryJob memoryJob = new MemoryJob(mainBoard);

        mainBoard.setCpuJob(cpuJob);
        mainBoard.setGpuJob(gpuJob);
        mainBoard.setMemoryJob(memoryJob);
        mainBoard.start();
    }
}

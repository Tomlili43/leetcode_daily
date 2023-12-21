package com.tom.app;

import java.util.concurrent.ThreadPoolExecutor;

public class Monitor implements Runnable{
    private boolean run = true;
    private int delayInSeconds;
    private ThreadPoolExecutor poolExecutor;

    public Monitor(int delayInSeconds, ThreadPoolExecutor poolExecutor){
        this.delayInSeconds = delayInSeconds;
        this.poolExecutor = poolExecutor;
    }   

    @Override
    public void run(){
        while(run){
            System.out.println(
                String.format(
                    "[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                    this.poolExecutor.getPoolSize(),
                    this.poolExecutor.getCorePoolSize(),
                    this.poolExecutor.getActiveCount(),
                    this.poolExecutor.getCompletedTaskCount(),
                    this.poolExecutor.getTaskCount(),
                    this.poolExecutor.isShutdown(),
                    this.poolExecutor.isTerminated()
                )
            );
            try{
                Thread.sleep(this.delayInSeconds * 1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.run = false;
    }
}
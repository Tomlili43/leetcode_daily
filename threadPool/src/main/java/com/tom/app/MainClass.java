package com.tom.app;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        int corePoolSize = 2;
        int maximumPoolSize = 5;
        int keepAliveTime = 10;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
            corePoolSize,
            maximumPoolSize, 
            keepAliveTime, 
            unit, 
            workQueue,
            threadFactory,
            new RejectionHandler()
            );

        Monitor monitor = new Monitor(1, poolExecutor);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();

        for(int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            poolExecutor.execute(new Worker(i));
        }
        Thread.sleep(1000); 
        poolExecutor.shutdown();   
        Thread.sleep(1000);
        monitor.shutdown();
    }
}

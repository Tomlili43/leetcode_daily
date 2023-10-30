package threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.xml.ws.handler.Handler;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        int corePoolSize = 2;
        int maximumPoolSize = 5;
        int keepAliveTime = 10;
        int queueSize = 3;
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
            corePoolSize, 
            maximumPoolSize, 
            keepAliveTime, 
            TimeUnit.SECONDS, 
            new ArrayBlockingQueue<>(queueSize), 
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

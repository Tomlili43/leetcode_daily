package threadPool;

public class Worker implements Runnable {
    private Integer count;
 
    public Worker(Integer count) {
        this.count = count;
    }
 
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "start:" + count);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "end:" + count);
    }
    
    @Override
    public String toString() {
        return this.count.toString();
    }
}

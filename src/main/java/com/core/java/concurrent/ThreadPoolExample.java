package com.core.java.concurrent;

import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,
                10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), new MyCustomThreadFactory(),new CustomRejectHandler());
        executor.allowCoreThreadTimeOut(true);
        for(int i=0;i<7;i++){
            executor.submit(() ->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task processed by "+Thread.currentThread().getName());
            });
        }
        executor.shutdown();

    }
}

class MyCustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.setDaemon(false);
        //thread.setName("CustomThread");
        return thread;
    }
}
class CustomRejectHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected : "+ r.toString());
    }
}
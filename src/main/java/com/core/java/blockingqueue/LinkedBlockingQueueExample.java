package com.core.java.blockingqueue;

import java.util.Locale;
import java.util.concurrent.*;

public class LinkedBlockingQueueExample {
    public static final long startTime = System.currentTimeMillis();
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        for(int i=0;i<10;i++){
            int delaySecond = i *3;
            executor.schedule(() ->dequeue(queue),delaySecond, TimeUnit.SECONDS);
        }
        for(int i=0; i<10 ; i++){
            int element = i;
            int delayMillis = 3500 + i* 1000;
            executor.schedule(() -> enqueue(queue,element), delayMillis, TimeUnit.SECONDS);
        }
        executor.shutdown();
        executor.awaitTermination(1,TimeUnit.SECONDS);
    }
    private static void enqueue(BlockingQueue<Integer> queue, Integer element){
        log("Calling queue.put(%d) (queue = %s)...", element, queue);
        try {
            queue.put(element);
            log("queue.put(%d) returned (queue = %s)", element, queue);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    private static void dequeue(BlockingQueue<Integer> queue){
        log("calling queue.take() queue = %s.."+queue);
        try {
            Integer element = queue.take();
            log("queue.take() returned %d (queue = %s)", element, queue);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void log(String format, Object... arg){
        System.out.printf(Locale.US, "[%4.1fs][%-16s] %s%n",
                (System.currentTimeMillis()-startTime)/1000.0,Thread.currentThread().getName(),
                String.format(format,arg));
    }
}

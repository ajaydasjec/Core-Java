package com.core.java.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i=0;i< 5;i++){
            System.out.println("Producing :"+i);
            try {
                queue.put(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

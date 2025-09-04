package com.core.java.concurrent;

import java.time.LocalTime;
import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(2,new MyCustomThreadFactory());
        Future<String> future= executorService.submit(() ->{

            System.out.println("Task [Demo task ] executed on "+ LocalTime.now().toString());
            return "Demo Task";
        });
        String CompletedThresa = future.get(10, TimeUnit.SECONDS);
        System.out.println("Thread Completed "+ CompletedThresa);
    }
}

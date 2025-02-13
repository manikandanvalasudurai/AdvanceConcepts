package com.alibou.example.librarymanagement_system.introToThreads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnable = new HelloworldPrinter();
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(new SumCalculation(55));
        thread1.start();

        int input = 10;
//        for (int i = 0; i < input; i++) {
//            Thread t = new Thread(new printNumbes(i));
//            t.start();
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < input; i++) {
            executorService.execute(new printNumbes(i));
        }

        ExecutorService fibExecutorService = Executors.newCachedThreadPool();
        Future<Integer> ansFuture = fibExecutorService.submit(new fibnumbers(3,fibExecutorService));
        int ans = ansFuture.get();
        System.out.println(ans);
    }
}

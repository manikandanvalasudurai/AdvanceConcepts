package com.alibou.example.librarymanagement_system.multithreadedSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n = 1000000;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(i % 100);
        }
        // Threads or Chunks Both are same
        int noofThreads = Runtime.getRuntime().availableProcessors();
        int chunkSize = n / noofThreads;
        System.out.println("Chunk size: " + chunkSize);
        ExecutorService executor = Executors.newFixedThreadPool(noofThreads);
        List<Future<Long>> sumFutures = new ArrayList<>();
        //Future generation in 16 threads each tast is going to be executed
        for (int i = 0; i < noofThreads; i++) {
            SumCalculation tempTask = new SumCalculation(list , i * chunkSize, (i+1) * chunkSize);
            Future future = executor.submit(tempTask);
            sumFutures.add(future);

          //  sumFutures.add(executor.submit(new SumCalculation(list , i * chunkSize, (i+1) * chunkSize)));

        }
        Long sum = 0L;

        //Loop Futures and getting values
        for (Future<Long> future : sumFutures) {
            sum += future.get();
        }
        System.out.println("Sum: " + sum);

    }
}

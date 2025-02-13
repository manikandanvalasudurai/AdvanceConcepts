package com.alibou.example.librarymanagement_system.introToThreads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class fibnumbers implements Callable<Integer> {
    int number;
    ExecutorService executor;
    fibnumbers(int number, ExecutorService executor) {
        this.number = number;
        this.executor = executor;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Calculate Fib " + number + "using " + Thread.currentThread().getName());
        if(number ==  0 || number == 1) return number;
        Future<Integer> future = executor.submit(new fibnumbers(number-1,executor));
        Future<Integer> future2 = executor.submit(new fibnumbers(number-2,executor));
        int x = future.get();
        int y = future2.get();
        return x + y;
    }
}

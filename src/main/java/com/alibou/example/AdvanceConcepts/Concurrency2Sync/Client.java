package com.alibou.example.AdvanceConcepts.Concurrency2Sync;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Lock lock = new ReentrantLock();
       Value value = new Value();
       Adder adder = new Adder(value,lock);
       Subtractor subtractor = new Subtractor(value,lock);

       ExecutorService executor = Executors.newFixedThreadPool(2);
       Future<Void> add = executor.submit(adder);
       Future<Void> sub = executor.submit(subtractor);

       add.get();
       sub.get();

       System.out.println(value.getX());
    }
}

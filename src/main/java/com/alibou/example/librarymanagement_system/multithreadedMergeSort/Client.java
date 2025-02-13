package com.alibou.example.librarymanagement_system.multithreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> ls = List.of(5, 894, 84, 84, 98, 8, 8, 48, 8, 4);
        ExecutorService executor = Executors.newCachedThreadPool();
        Sorter task = new Sorter(ls, executor);
        Future<List<Integer>> future = executor.submit(task);
        ls = future.get();
        System.out.println(ls);
    }
}

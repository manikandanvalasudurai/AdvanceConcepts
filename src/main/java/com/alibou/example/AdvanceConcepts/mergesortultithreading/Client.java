package com.alibou.example.AdvanceConcepts.mergesortultithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> numbers = List.of(5,3,2,6,4,1,8,9,0,1,45,8);


        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(numbers, executorService);
        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);

        List<Integer> sortedList = sortedListFuture.get();

        System.out.println(sortedList);


    }
}

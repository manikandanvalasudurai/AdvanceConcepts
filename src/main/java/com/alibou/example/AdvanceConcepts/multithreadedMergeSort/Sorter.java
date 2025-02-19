package com.alibou.example.AdvanceConcepts.multithreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> list;
    ExecutorService executor;
    Sorter(List<Integer> list, ExecutorService executor) {
        this.list = list;
        this.executor = executor;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(list.size() <= 1) return list;
        int mid = list.size() / 2;
        List<Integer> leftHalf = new ArrayList<>(list.subList(0, mid));
        List<Integer> rightHalf = new ArrayList<>(list.subList(mid, list.size()));

        Sorter leftSide = new Sorter(leftHalf, executor);
        Sorter rightSide = new Sorter(rightHalf, executor);

        Future<List<Integer>> leftSideFuture = executor.submit(leftSide);
        Future<List<Integer>> rightSideFuture = executor.submit(rightSide);
        leftHalf = leftSideFuture.get();
        rightHalf = rightSideFuture.get();
        List<Integer> result = new ArrayList<>(leftHalf.size() + rightHalf.size());
        int i = 0,j = 0;
        while(i < leftHalf.size() && j < rightHalf.size()) {
           if(leftHalf.get(i) < rightHalf.get(j)) {
               result.add(leftHalf.get(i));
               i++;
           }
           else{
               result.add(rightHalf.get(j));
               j++;
           }
        }
        while(i < leftHalf.size()) {
            result.add(leftHalf.get(i));
            i++;
        }
        while(j < rightHalf.size()) {
            result.add(rightHalf.get(j));
            j++;
        }
        return result;
    }
}

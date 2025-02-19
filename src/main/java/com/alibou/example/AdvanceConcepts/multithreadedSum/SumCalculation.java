package com.alibou.example.AdvanceConcepts.multithreadedSum;

import java.util.List;
import java.util.concurrent.Callable;

public class SumCalculation implements Callable<Long> {
   private List<Integer> arr;
   private int start,end;
   public SumCalculation(List<Integer> arr, int start, int end) {
       this.arr = arr;
       this.start = start;
       this.end = end;
   }

    @Override
    public Long call() throws Exception {
        Long sum = 0L;
        for (int i = start; i < end; i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}

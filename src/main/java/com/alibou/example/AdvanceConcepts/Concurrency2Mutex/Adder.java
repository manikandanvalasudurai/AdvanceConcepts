package com.alibou.example.AdvanceConcepts.Concurrency2Mutex;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value) {
        this.value = value;

    }
    @Override
    public Void call() throws Exception {
       for(int i=1; i <1000000;i++){
           synchronized(value) {
               System.out.println("Adding " + i);
               value.setX(value.getX() + i);
           }

       }
       return null;
    }
}

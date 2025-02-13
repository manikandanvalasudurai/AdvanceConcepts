package com.alibou.example.librarymanagement_system.Concurrency2Mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value) {
        this.value = value;

    }
    @Override
    public Void call() throws Exception {
       for(int i=1; i <100000;i++){
           synchronized(value) {
               System.out.println("Adding " + i);
               value.setX(value.getX() + i);
           }

       }
       return null;
    }
}

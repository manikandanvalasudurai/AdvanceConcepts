package com.alibou.example.AdvanceConcepts.Concurrency2Sync;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;
    private Lock lock;
    public Subtractor(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i <100000;i++){
            lock.lock();
            System.out.println("Subtractor " + i);
            value.setX(value.getX()-i);
            lock.unlock();
        }
        return null;
    }
}

package com.alibou.example.AdvanceConcepts.synchMehod;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock)
    {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i= 1;i <=100000;i++){
                count.incrementValue(i);
            }
        }
    }


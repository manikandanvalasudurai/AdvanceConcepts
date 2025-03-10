package com.alibou.example.AdvanceConcepts.produceconsumer;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;


    public Producer(Queue<Object> store, int maxSize,String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true) {
            if(store.size() < maxSize) {
                System.out.println(this.name + " Producer placed an Item and Size --> " + store.size());
                store.add(new Object());
            }
        }
    }
}

package com.alibou.example.AdvanceConcepts.produceconsumer;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;


    public Consumer(Queue<Object> store, int maxSize,String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }
    @Override
    public void run() {
        while(true) {
            if(store.size() > maxSize) {
                System.out.println(this.name + " Consumer consumes an Item and Size --> " + store.size());
                store.remove();
            }
        }

    }
}

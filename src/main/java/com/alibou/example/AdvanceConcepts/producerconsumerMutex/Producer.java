package com.alibou.example.AdvanceConcepts.producerconsumerMutex;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;
    Semaphore producersemaphore;
    Semaphore consumersemaphore;


    public Producer(Queue<Object> store, int maxSize,String name, Semaphore producersemaphore,Semaphore consumersemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producersemaphore = producersemaphore;
        this.consumersemaphore = consumersemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                producersemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (store) { // Ensure thread safety
//                if (store.size() < maxSize) {
                    store.add(new Object());
                    System.out.println(this.name + " Producer placed an Item and Size --> " + store.size());
//                }
            }

            consumersemaphore.release();
        }
    }

}

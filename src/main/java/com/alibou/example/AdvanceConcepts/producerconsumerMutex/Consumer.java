package com.alibou.example.AdvanceConcepts.producerconsumerMutex;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;



    public Consumer(Queue<Object> store, int maxSize, String name,Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;

    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (store) { // Ensure thread safety
//                if (store.size() > 0) {
                    store.remove();
                    System.out.println(this.name + " Consumer consumes an Item and Size --> " + store.size());
//                }
            }

            producerSemaphore.release();
        }
    }
}
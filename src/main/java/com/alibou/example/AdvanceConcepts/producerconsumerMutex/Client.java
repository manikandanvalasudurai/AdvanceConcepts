package com.alibou.example.AdvanceConcepts.producerconsumerMutex;

import java.util.Queue;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        int numProducers = 8;
        int numConsumers = 10;

        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < numProducers; i++) {
            Producer producer = new Producer(store, maxSize, "producer" + i, producerSemaphore, consumerSemaphore);
            executor.submit(producer);
        }

        for (int i = 0; i < numConsumers; i++) {
            Consumer consumer = new Consumer(store, maxSize, "consumer" + i, producerSemaphore,consumerSemaphore);
            executor.submit(consumer);
        }

    }
}

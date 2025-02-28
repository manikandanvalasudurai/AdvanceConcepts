package com.alibou.example.AdvanceConcepts.produceconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        int numProducers = 8;
        int numConsumers = 10;

        ExecutorService executor = Executors.newFixedThreadPool(numProducers + numConsumers);

        for (int i = 0; i < numProducers; i++) {
            Producer producer = new Producer(store, maxSize, "producer" + i);
            executor.submit(producer);
        }

        for (int i = 0; i < numConsumers; i++) {
            Consumer consumer = new Consumer(store, maxSize,"consumer" + i );
            executor.submit(consumer);
        }
    }
}

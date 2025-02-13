package com.alibou.example.librarymanagement_system.Semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Semaphore producerSema = new Semaphore(5);
        Semaphore consumerSema = new Semaphore(0);
        Store store = new Store();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Producer(store,producerSema,consumerSema));
        }
        for (int i = 0; i < 8; i++) {
            executorService.execute(new Consumer(store,producerSema,consumerSema));
        }
    }
}

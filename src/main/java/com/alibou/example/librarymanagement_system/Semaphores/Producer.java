package com.alibou.example.librarymanagement_system.Semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;
    public Producer(Store store, Semaphore producerSema,Semaphore consumerSema) {
        this.store = store;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }
    @Override
    public void run() {
        //constantly produce the item
        while(true){
            try {
                producerSema.acquire();
                synchronized (store) {
                    if (store.getMaxSize() > store.getItems().size()) {
                        store.add(new Object());
                    }
                }
                consumerSema.release();
            }
            catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}

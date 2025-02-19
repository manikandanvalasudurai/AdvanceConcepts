package com.alibou.example.AdvanceConcepts.producerconsumerSyncBlock;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.getItems().size() > 0) {
                    store.remove();
                }
            }
        }
    }
}

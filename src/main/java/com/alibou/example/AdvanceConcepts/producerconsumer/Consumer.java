package com.alibou.example.AdvanceConcepts.producerconsumer;

public class Consumer implements Runnable {
    private Store store;
    public Consumer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        while (true) {
            if(store.getItems().size() > 0){
                store.remove();
            }
        }
    }
}

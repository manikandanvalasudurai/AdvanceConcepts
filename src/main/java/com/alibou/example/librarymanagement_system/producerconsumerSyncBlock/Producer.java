package com.alibou.example.librarymanagement_system.producerconsumerSyncBlock;

public class Producer implements Runnable {
    private Store store;
    public Producer(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        //constantly produce the item
        while(true){
            synchronized(store){
            if(store.getMaxSize() > store.getItems().size()) {
                store.add(new Object());
            }
            }
        }
    }
}

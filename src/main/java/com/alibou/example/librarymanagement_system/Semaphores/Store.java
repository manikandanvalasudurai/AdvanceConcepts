package com.alibou.example.librarymanagement_system.Semaphores;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
   // private List<Object> items = new ArrayList<Object>();
    private ConcurrentLinkedQueue<Object> items = new ConcurrentLinkedQueue<>();
    private int maxSize = 5;

    public synchronized void add(Object item) {
        System.out.println("item is being added " + items.size());
        items.add(item);
    }

    public synchronized void remove() {
        System.out.println("item is being removed " + items.size());
        items.remove();
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }
}

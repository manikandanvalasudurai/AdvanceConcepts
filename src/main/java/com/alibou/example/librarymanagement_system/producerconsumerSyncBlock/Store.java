package com.alibou.example.librarymanagement_system.producerconsumerSyncBlock;
import java.util.ArrayList;
import java.util.List;
public class Store {
    private List<Object> items = new ArrayList<Object>();
    private int maxSize = 5;

    public synchronized void add(Object item) {
        System.out.println("item is being added " + items.size());
        items.add(item);
    }

    public synchronized void remove() {
        System.out.println("item is being removed " + items.size());
        items.remove(items.size()-1);
    }

    public List<Object> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }
}

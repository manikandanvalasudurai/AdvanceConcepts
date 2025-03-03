package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Item>{
    private HashMap<String,T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void add (T item){
        //creating inventory for only item or anything under items
        items.put(item.getId(), item);
    }

    public void remove(T item){
        items.remove(item.getId());
    }

    public void remove(String itemId){
        items.remove(itemId);
    }

    public T getItems(String itemId){
        return items.get(itemId);
    }

    public List<T> getAllitems(String itemId){
        return new ArrayList<>(items.values());
    }
}

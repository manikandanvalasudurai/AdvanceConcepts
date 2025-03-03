package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

import java.util.LinkedHashMap;

public class RecentlyViewedItems<T extends Item> {
    private LinkedHashMap<String,T> recentlyViwedItems;
    private int max_Size = 3;

    public RecentlyViewedItems() {
        recentlyViwedItems = new LinkedHashMap<>();
    }

    public void addRecentlyViwedItem(T item) {
        // Remove the item if it was already viewed (to update its position)
        recentlyViwedItems.remove(item.getId());

        // Add the item to the end (most recently viewed)
        recentlyViwedItems.put(item.getId(), item);

        // If the size exceeds the limit, remove the oldest (first added) item
        if (recentlyViwedItems.size() > max_Size) {
            // Get the first key (oldest entry) and remove it
            recentlyViwedItems.remove(recentlyViwedItems.keySet().iterator().next());
        }
    }

    public LinkedHashMap<String,T> getRecentlyViwedItems() {
        return recentlyViwedItems;
    }

}

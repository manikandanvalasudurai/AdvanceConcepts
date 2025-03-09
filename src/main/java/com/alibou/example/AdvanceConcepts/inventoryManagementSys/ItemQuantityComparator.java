package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        // o1 return -1
        //02 first retunrn 1
        //desending order or quantity
        if(o1.getQuantity() < o2.getQuantity()){
            return 1;
        }
        else if(o1.getQuantity() > o2.getQuantity()){
            return -1;
        }
        return 0;
    }
}

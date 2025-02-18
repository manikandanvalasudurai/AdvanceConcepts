package com.alibou.example.librarymanagement_system.exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Electronics("E1","Laptop",599.5,4,24));
        items.add(new Clothing("C1","T-shirt",66.5,1,"S"));
        items.add(new Book("B1","Java Programming",10.2,5,"Mani"));
        System.out.println("Default List\n");
        for (Item item : items) {
            System.out.println(item.getName());
        }
        //Collections.sort(items);
        //one is Calling the compareTo one is Passed in the Param
            Collections.sort(items);
        System.out.println("\nSorted List Using Comparable in compareTo Method Using Price\n");
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}

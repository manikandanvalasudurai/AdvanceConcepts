package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

import GenericsCollectionExcercise.Milestone2.RecentlyViwedItems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<Item>();

        items.add(new Electronic("E1","Laptop",56555,1,26));
        items.add(new Clothing("C1","T shirt",560,5,"XXL"));
        items.add(new Book("B1","Java Programming",11,2,"Indu"));

        for(Item item : items){
            System.out.println(item.getName());
        }
        Collections.sort(items);
        System.out.println("\nList After Comparable\n");
        for(Item item : items){
            System.out.println(item.getName());
        }

        Inventory<Electronic> electronicInventory = new Inventory<>();
        electronicInventory.add(new Electronic("E1","Laptop",56555,1,26));
        electronicInventory.add(new Electronic("E2","MacBook",652220,5,29));

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Clothing> clothingInventory = new Inventory<>();
        Inventory<Item> itemInventory = new Inventory<>();

        Item item1 = new Book("Bhagavath Geetha","Spritual",7,6,"Kalki");
        Item item2 = new Clothing("Phant","Jean",550,5,"XL");
        Item item3 = new Electronic("Remote","SmartRemote",150,1,30);
        Item item4 = new Book("Geetha","ritual",75,1,"Kali");
        Item item5 = new Clothing("Shirt","Whool",1000,15,"L");

        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems<Item>();

        recentlyViewedItems.addRecentlyViwedItem(item2);
        recentlyViewedItems.addRecentlyViwedItem(item3);
        recentlyViewedItems.addRecentlyViwedItem(item5);
        recentlyViewedItems.addRecentlyViwedItem(item1);

        System.out.println("\nRecentlyViewedItems : \n");

        List<Item> recentlyViewedList = new ArrayList<>(recentlyViewedItems.getRecentlyViwedItems().values());
        for(Item item : recentlyViewedList){
            System.out.println(item.getName());
        }
    }
}

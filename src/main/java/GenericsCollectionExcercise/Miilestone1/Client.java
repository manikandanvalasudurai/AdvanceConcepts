package GenericsCollectionExcercise.Miilestone1;
import GenericsCollectionExcercise.Milestone2.Inventory;
import GenericsCollectionExcercise.Milestone2.RecentlyViwedItems;

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
        //one is Calling the compareTo one is Passed in the Param
        Collections.sort(items);  // --> Comparable

        //Comparator
        Collections.sort(items, new ItemQuantityComparator());
        System.out.println("\nSorted List Using Comparator in compareTo Method Using Price\n");
        for (Item item : items) {
            System.out.println(item.getName());
        }
       // System.out.println("\nBefore adding inventory\n");
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics("E1","Laptop",599.5,4,24));
        electronicsInventory.add(new Electronics("E2","MacBook",646.8,5,28));
        electronicsInventory.add(new Electronics("E3","Mobile",99.5,2,24));
        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.add(new Book("B1","Java Programming",10.2,5,"Mani"));
        bookInventory.add(new Book("B2","Atomic Habits",52.6,2,"MKV"));
        bookInventory.add(new Book("B3","DSA Programming",1.2,1,"lgm"));
        Inventory<Clothing> clothingInventory = new Inventory<>();
        clothingInventory.add(new Clothing("C1","T-shirt",66.5,1,"S"));
        clothingInventory.add(new Clothing("C2","shirt",54.3,2,"m"));
        clothingInventory.add(new Clothing("C3","Phant",6.5,3,"l"));
        Inventory<Item> itemInventory = new Inventory<>();
       // System.out.println("\nAfter adding inventory\n");

        Item Item1 = new Electronics("E1","LAP",599.5,4,25);
        Item Item2 = new Electronics("E2","SYS",5459.5,5,26);
        Item Item3 = new Electronics("E3","MOB",65,45,27);
        Item Item4 = new Electronics("E4","BOARD",55,32,28);
        Item Item5 = new Electronics("E5","KEYBOARD",85,211,29);

        RecentlyViwedItems recentlyViwedItems = new RecentlyViwedItems();
        recentlyViwedItems.addRecentlyViwedItem(Item3);
        recentlyViwedItems.addRecentlyViwedItem(Item1);
        recentlyViwedItems.addRecentlyViwedItem(Item5);
        recentlyViwedItems.addRecentlyViwedItem(Item2);
        recentlyViwedItems.addRecentlyViwedItem(Item5);
      //  System.out.println("\nrecentlyViwedItemsList\n");
        List<Item> recentlyViwedItemsList = recentlyViwedItems.getRecentlyViwedItems();
        for (Item item : recentlyViwedItemsList) {
     //       System.out.println(item.getName());
        }
    }
}

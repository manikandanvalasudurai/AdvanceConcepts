package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<Item>();

        items.add(new Electronic("E1","Laptop",56555,1,26));
        items.add(new Clothing("C1","T shirt",560,5,"XXL"));
        items.add(new Book("B1","Java Programming",11,2,"Indu"));
        System.out.println("\nFirst Task --> 1\n");
        items
                .stream()
                .map((item -> {return item.getId();}))
                .forEach((data) -> {System.out.println(data);});

        System.out.println("\nFirst Task --> 2 \n");
        List<String> idList = items
                .stream()
                .map((item -> {return item.getName().toLowerCase();}))
                .collect(Collectors.toList());
        System.out.println(idList);
        System.out.println("\nFirst Task --> 3\n");
        List<Integer> nameLengths  = items
                        .stream().map(item -> item.getName().length()).collect(Collectors.toList());
        System.out.println(nameLengths);

        System.out.println("\nSecond Task --> 1\n");
        items.stream()
                .filter(item -> item.getPrice() > 1000)
                .forEach(data -> System.out.println(data.getName()));
        System.out.println("\nSecond Task --> 2\n");
        boolean hasQuantity =  items.stream().anyMatch(item -> item.getQuantity() == 0);
        System.out.println(hasQuantity);
        System.out.println("\nSecond Task --> 3\n");
        boolean price  = items.stream().allMatch(item -> item.getPrice() > 0);
        System.out.println(price);
        System.out.println("\nSecond Task --> 4\n");
        boolean nonematch =  items.stream().noneMatch(item -> item.getQuantity() < 0);
        System.out.println(price);
        System.out.println("\nThired Task\n");
        List<String> finaList = items
                .stream()
                .filter(item -> item.getPrice() > 100 && item.getQuantity() > 0)
                .map(item -> item.getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(finaList);
        System.out.println("\nFourth Task --> 1\n");
        int totalquantity = items.stream()
                .map(item -> item.getQuantity())
                .reduce(0,(total,quantity)->{
                    total += quantity;
                    return total;
                });
        System.out.println(totalquantity);
        System.out.println("\nFourth Task --> 2\n");
        Optional<Item> mostExpensive = items
                .stream()
                .reduce((item1,item2)->{
                    if(item1.getPrice() > item2.getPrice()){
                        return item1;
                    }
                    return item2;
                });
        System.out.println(mostExpensive.get().getName());

        Integer expensive2 = items
                .stream()
                        .map(data -> data.getPrice())
                                .reduce(Integer.MIN_VALUE,(price1,price2) -> {
                                    return Math.max(price1,price2);
                                });
        System.out.println(expensive2);

        System.out.println("\nFourth Task --> 3\n");
        Optional<String> itemnames = items
                .stream()
                .map(data -> data.getName())
                .reduce((ans,curr) -> {
                    return ans +" "+ curr;
                });
        System.out.println(itemnames);





//        for(Item item : items){
//            System.out.println(item.getName());
//        }
//        Collections.sort(items);
//        System.out.println("\nList After Comparable\n");
//        for(Item item : items){
//            System.out.println(item.getName());
//        }
//        System.out.println("\nList After Comparator\n");
//        Collections.sort(items, new ItemQuantityComparator());
//        for(Item item : items){
//            System.out.println(item.getName());
//        }
//
//        Inventory<Electronic> electronicInventory = new Inventory<>();
//        electronicInventory.add(new Electronic("E1","Laptop",56555,1,26));
//        electronicInventory.add(new Electronic("E2","MacBook",652220,5,29));
//
//        Inventory<Book> bookInventory = new Inventory<>();
//        Inventory<Clothing> clothingInventory = new Inventory<>();
//        Inventory<Item> itemInventory = new Inventory<>();
//
        Item item1 = new Book("Bhagavath Geetha","Spritual",7,6,"Kalki");
        Item item2 = new Clothing("Phant","Jean",550,5,"XL");
        Item item3 = new Electronic("Remote","SmartRemote",150,1,30);
        Item item4 = new Book("Geetha","ritual",75,1,"Kali");
        Item item5 = new Clothing("Shirt","Whool",1000,15,"L");


//
//        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems<Item>();
//
//        recentlyViewedItems.addRecentlyViwedItem(item2);
//        recentlyViewedItems.addRecentlyViwedItem(item3);
//        recentlyViewedItems.addRecentlyViwedItem(item5);
//        recentlyViewedItems.addRecentlyViwedItem(item1);
//
//        System.out.println("\nRecentlyViewedItems : \n");
//
//        List<Item> recentlyViewedList = new ArrayList<>(recentlyViewedItems.getRecentlyViwedItems().values());
//        for(Item item : recentlyViewedList){
//            System.out.println(item.getName());
//        }
    }
}

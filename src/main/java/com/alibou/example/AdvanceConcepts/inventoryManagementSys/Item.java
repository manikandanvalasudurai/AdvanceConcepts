package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private int price;
    private int quantity;

    public Item() {
    }

    public Item(String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setItem(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item o) {
        if(this.price > o.price){
            return 1;
        }
        else if(this.price < o.price){
            return -1;
        }
        return 0;
    }
}

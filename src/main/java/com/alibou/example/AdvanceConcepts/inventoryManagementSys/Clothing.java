package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

public class Clothing extends Item{
    private String size;

    public Clothing(String item, String name, int price, int quantity, String size) {
        super(item, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

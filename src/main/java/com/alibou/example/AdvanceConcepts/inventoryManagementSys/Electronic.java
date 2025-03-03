package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

public class Electronic extends Item{
    private int warrentyDate;


    public Electronic(String item, String name, int price, int quantity, int warrentyDate) {
        super(item, name, price, quantity);
        this.warrentyDate = warrentyDate;
    }

    public int getWarrentyDate() {
        return warrentyDate;
    }

    public void setWarrentyDate(int warrentyDate) {
        this.warrentyDate = warrentyDate;
    }
}


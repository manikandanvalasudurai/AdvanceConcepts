package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

public class Book extends Item{
    private String author;

    public Book(String item, String name, int price, int quantity, String author) {
        super(item, name, price, quantity);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

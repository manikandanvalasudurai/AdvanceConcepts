package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

public class InventoryService implements OnOrderPlacedSubscriber{

    InventoryService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOnOrderPlacedSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Notifying Inventory Service");
    }
}

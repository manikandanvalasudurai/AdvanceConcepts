package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

public class EmailService implements OnOrderPlacedSubscriber{

    EmailService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOnOrderPlacedSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending Email");
    }
}

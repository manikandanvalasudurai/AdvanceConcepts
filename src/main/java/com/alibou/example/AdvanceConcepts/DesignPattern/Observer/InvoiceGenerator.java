package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

import java.util.Observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber {

    InvoiceGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOnOrderPlacedSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating invoice");
    }
}

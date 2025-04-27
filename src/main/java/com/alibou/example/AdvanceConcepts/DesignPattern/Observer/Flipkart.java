package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Flipkart {
    private static Flipkart instance = null;

    static Lock lock = new ReentrantLock();

    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<>();

    private Flipkart() {}

    public static Flipkart getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new Flipkart();
            }
            lock.unlock();
        }
        return instance;
    }
    void registerOnOrderPlacedSubscriber(OnOrderPlacedSubscriber subscriber) {
        onOrderPlacedSubscribers.add(subscriber);
    }
    void unregisterOnOrderPlacedSubscriber(OnOrderPlacedSubscriber subscriber) {
        onOrderPlacedSubscribers.remove(subscriber);
    }
    public void onOrderPlaced() {
        for(OnOrderPlacedSubscriber subscriber : onOrderPlacedSubscribers) {
            subscriber.announceOrderPlaced();
        }
    }
}

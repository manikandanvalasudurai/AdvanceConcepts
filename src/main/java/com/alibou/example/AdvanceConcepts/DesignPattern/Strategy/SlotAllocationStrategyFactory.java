package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

import org.springframework.boot.autoconfigure.web.WebProperties;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getSlotAllocationStrategy(String strategy) {
        SlotAllocationStrategy slotAllocationStrategy;
        if (strategy.equalsIgnoreCase("Farthest")) {
            slotAllocationStrategy = new FarthestSlotAllocationStrategy();
        } else if (strategy.equalsIgnoreCase("Nearest")) {
            slotAllocationStrategy = new NearestSlotAllocationStartegy();
        } else {
            slotAllocationStrategy = new RandomSlotAllocationStrategy();
        }

        return slotAllocationStrategy;
    }
}

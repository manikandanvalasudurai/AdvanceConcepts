package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

public class SlotAllocationFactory {
    public static SlotAllocationStrategy getSlotAllocation(String strategy) {
        SlotAllocationStrategy slotAllocationStrategy = null;
        if(strategy.equals("far")){
            slotAllocationStrategy = new Farthest();
        } else if (strategy.equals("near")) {
            slotAllocationStrategy = new Nearest();
        }
        else{
            slotAllocationStrategy = new Random();
        }
        return slotAllocationStrategy;
    }
}

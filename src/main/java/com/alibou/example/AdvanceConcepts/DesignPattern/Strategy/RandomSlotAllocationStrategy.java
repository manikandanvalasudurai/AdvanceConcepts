package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

public class RandomSlotAllocationStrategy implements  SlotAllocationStrategy {
    @Override
    public int allocateSlot() {
        return 5;
    }
}

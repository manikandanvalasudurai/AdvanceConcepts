package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

public class FarthestSlotAllocationStrategy implements SlotAllocationStrategy {
    @Override
    public int allocateSlot() {
        return 15;
    }
}

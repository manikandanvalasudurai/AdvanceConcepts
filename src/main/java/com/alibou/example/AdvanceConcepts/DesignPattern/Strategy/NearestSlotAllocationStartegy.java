package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

public class NearestSlotAllocationStartegy implements SlotAllocationStrategy {
    @Override
    public int allocateSlot() {
        return 1;
    }
}

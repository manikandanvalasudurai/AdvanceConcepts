package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

public class Random implements SlotAllocationStrategy   {
    @Override
    public int allocateSlot() {
        return 502;
    }
}

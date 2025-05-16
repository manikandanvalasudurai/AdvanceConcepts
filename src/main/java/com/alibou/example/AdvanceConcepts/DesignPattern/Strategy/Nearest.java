package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

public class Nearest implements SlotAllocationStrategy{
    @Override
    public int allocateSlot() {
        return 1;
    }
}

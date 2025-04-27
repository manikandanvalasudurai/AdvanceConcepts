package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

public class ParkingLot {
    private SlotAllocationStrategy slotAllocationStrategy;

    public ParkingLot(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public String generateTicket(){
        int slot = slotAllocationStrategy.allocateSlot();
        return " Ticket #" + slot;
    }
}

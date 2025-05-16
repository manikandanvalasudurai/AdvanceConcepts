package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hey Admin what is the Strategy you wAnt to use today");
        String strategy = scanner.nextLine();
        SlotAllocationStrategy slotAllocationStrategy = SlotAllocationFactory.getSlotAllocation(strategy);
        ParkingLot parkingLot = new ParkingLot(slotAllocationStrategy);
        System.out.println(parkingLot.generateTicket());
    }
}

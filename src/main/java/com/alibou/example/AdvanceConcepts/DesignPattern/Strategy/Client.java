package com.alibou.example.AdvanceConcepts.DesignPattern.Strategy;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println( "what is the Strategy today ?");
        String strategy = scanner.nextLine();
        SlotAllocationStrategy slotAllocationStrategy = SlotAllocationStrategyFactory.getSlotAllocationStrategy(strategy);
        ParkingLot parkingLot = new ParkingLot(slotAllocationStrategy);
        System.out.println(parkingLot.generateTicket());
    }
}

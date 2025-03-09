package com.alibou.example.AdvanceConcepts.inventoryManagementSys;

public class InvalidQuantityExceptions extends RuntimeException {
    public InvalidQuantityExceptions(String message) {
        super(message + " is not a valid quantity");
    }
}

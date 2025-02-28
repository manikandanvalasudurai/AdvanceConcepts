package com.alibou.example.AdvanceConcepts.synchMehod;

public class Count {
    private int value = 0;
    public Count(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void incrementValue(int i) {
      this.value += i;
    }
    public synchronized void decrement(int i) {
        this.value -= i;
    }
}

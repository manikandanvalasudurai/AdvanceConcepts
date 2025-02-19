package com.alibou.example.AdvanceConcepts.syncMethod;

public class Value {
   private int x = 0;

//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
    synchronized void increment(int i) {
        System.out.println("Adding " + i);
        x += i;
    }
    synchronized void decrement(int i) {
        System.out.println("Subtractor " + i);
        x -= i;
    }
}

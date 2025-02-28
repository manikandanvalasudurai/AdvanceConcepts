package com.alibou.example.AdvanceConcepts.multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World ! from " + Thread.currentThread().getName());
        Helper helper = new Helper();
        helper.doSomething();
    }
}

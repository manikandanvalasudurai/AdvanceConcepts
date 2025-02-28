package com.alibou.example.AdvanceConcepts.multithreading;

public class Helper {
    public void doSomething() {
        System.out.println("Hello World from Helper " + Thread.currentThread().getName());
    }
}

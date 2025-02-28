package com.alibou.example.AdvanceConcepts.multithreading.HelloworldPrinter;

import com.alibou.example.AdvanceConcepts.introToThreads.HelloworldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World ! from " + Thread.currentThread().getName());
        HelloworldPrinter helloworldPrinter = new HelloworldPrinter();
        Thread  thread = new Thread(helloworldPrinter);
        thread.start();
        System.out.println("Hello World ! from " + Thread.currentThread().getName());
    }
}

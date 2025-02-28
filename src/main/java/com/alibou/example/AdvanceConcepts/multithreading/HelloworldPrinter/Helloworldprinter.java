package com.alibou.example.AdvanceConcepts.multithreading.HelloworldPrinter;

public class Helloworldprinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World from HelloworldPrinter " + Thread.currentThread().getName() );
    }
}

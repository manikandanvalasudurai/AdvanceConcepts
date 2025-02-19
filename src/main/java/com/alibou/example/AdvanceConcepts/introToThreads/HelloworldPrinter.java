package com.alibou.example.AdvanceConcepts.introToThreads;

public class HelloworldPrinter implements Runnable {
    public void print(){
        System.out.println("Hello World from Thread" + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        print();
    }
}

package com.alibou.example.librarymanagement_system.introToThreads;

public class printNumbes implements Runnable {
    int input;
    printNumbes(int input) {
        this.input = input;
    }
    @Override
    public void run() {
        System.out.println("The number is: " + input + " Thread ID: " + Thread.currentThread().getId());
    }
}

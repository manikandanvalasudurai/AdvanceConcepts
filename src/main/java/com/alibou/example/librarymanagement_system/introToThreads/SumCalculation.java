package com.alibou.example.librarymanagement_system.introToThreads;

public class SumCalculation implements Runnable {
    int input;
    SumCalculation(int input) {
        this.input = input;
    }
    public void calculation() {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println("The sum of the numbers is: " + sum + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        calculation();
    }
}

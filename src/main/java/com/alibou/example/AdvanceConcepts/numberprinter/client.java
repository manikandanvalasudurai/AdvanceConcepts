package com.alibou.example.AdvanceConcepts.numberprinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; i++) {
            if(i == 10 || i == 50 || i == 98) {
                System.out.println("DEBUG");
            }
            Printer printer = new Printer(i);
            ex.execute(printer);
        }
        ex.shutdown();
    }
}

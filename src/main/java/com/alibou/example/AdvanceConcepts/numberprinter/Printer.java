package com.alibou.example.AdvanceConcepts.numberprinter;

public class Printer implements Runnable{
    private int numbertoPrint;
    Printer(int numbertoPrint){
        this.numbertoPrint = numbertoPrint;
    }
    @Override
    public void run() {
        System.out.println(numbertoPrint + "  =  printed by thread thread name --> " + Thread.currentThread().getName());
    }
}

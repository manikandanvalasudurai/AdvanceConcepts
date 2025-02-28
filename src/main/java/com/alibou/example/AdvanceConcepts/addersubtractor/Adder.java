package com.alibou.example.AdvanceConcepts.addersubtractor;

import org.w3c.dom.css.Counter;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i= 1;i <=100000;i++){
            count.value += i;
        }
    }
}

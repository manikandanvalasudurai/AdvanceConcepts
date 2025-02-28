package com.alibou.example.AdvanceConcepts.addersubtractor;

import org.w3c.dom.css.Counter;

public class Subtractor implements Runnable {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i= 1;i <=100000;i++){
            count.value -= i;
        }
    }
}

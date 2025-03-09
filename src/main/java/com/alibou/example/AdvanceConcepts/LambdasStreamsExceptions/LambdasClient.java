package com.alibou.example.AdvanceConcepts.LambdasStreamsExceptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdasClient {
    public static void main(String[] args) {

        Runnable run = () -> {
            System.out.println("Hello World");
        };
        Thread thread = new Thread(run);
        thread.start();

//        Thread t = new Thread(() -> {
//            System.out.println("Hello World");
//        });
//        Callable<Integer> callable = () -> {
//            return 4+2;
//        };

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.sort(list, (arg1, arg2)  -> {
            if(arg1 % 2 != 0){
                return -1;
            }
            else if(arg1 % 2 == 0){
                return 1;
            }
            return 0;
        });
        System.out.println(list);
    }
}
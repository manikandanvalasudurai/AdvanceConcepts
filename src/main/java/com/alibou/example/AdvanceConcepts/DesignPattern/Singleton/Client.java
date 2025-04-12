package com.alibou.example.AdvanceConcepts.DesignPattern.Singleton;

public class Client {
    public static void main(String[] args) {
        // Runnable that tries to get the DBConnection instance
        Runnable task = () -> {
            DBConnection instance = DBConnection.getInstance();
            System.out.println(Thread.currentThread().getName() + " got instance: " + instance);
        };

        // Create multiple threads
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        Thread t4 = new Thread(task, "Thread-4");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
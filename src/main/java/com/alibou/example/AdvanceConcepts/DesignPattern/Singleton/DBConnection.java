package com.alibou.example.AdvanceConcepts.DesignPattern.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    String url;
    String username;
    String password;
    private static DBConnection instance = new DBConnection();
    private static final Lock lock = new ReentrantLock();

    private DBConnection() {

    }
    public static DBConnection getInstance() {
        if(instance == null) {
            lock.lock();
            if(instance == null) {
                return instance;
            }
            lock.unlock();
        }
        return instance;
    }
}

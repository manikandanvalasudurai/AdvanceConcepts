package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

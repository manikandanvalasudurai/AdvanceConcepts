package com.alibou.example.AdvanceConcepts.Generics;

public class Pair<T , V> {
    T first;
    V second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
    public <k> k doSomething(k something) {
        return something;
    }
}

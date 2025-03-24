package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        System.out.println("Registering observer " + o);
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        System.out.println("Removing observer " + o);
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        //might do something then called notifyObservers();
        notifyObservers();
    }

    public void setMeasurements(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

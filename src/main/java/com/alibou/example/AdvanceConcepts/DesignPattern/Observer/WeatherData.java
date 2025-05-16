package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private Float temperature;
    private Float humidity;
    private Float pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        System.out.println("Observer registered -->" + o);
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        System.out.println("Observer removed -->" + o);
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        //we can do if something need to be changed before want to call notifyObserver
        notifyObservers();
    }
    public void setMeasurements(Float temperature, Float humidity, Float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

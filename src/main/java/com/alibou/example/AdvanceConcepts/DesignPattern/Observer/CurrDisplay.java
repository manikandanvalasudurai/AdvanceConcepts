package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

public class CurrDisplay implements Display,Observer {
    private Float temperature;
    private Float humidity;
    private Float pressure;
    private Subject subject;

    public CurrDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Current Statistics  : ");
        System.out.println("Temperature : " + temperature
        + "\nHumidity : " + humidity
        + "\nPressure : " + pressure
        + "\nSubject : " + subject
        );
    }

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

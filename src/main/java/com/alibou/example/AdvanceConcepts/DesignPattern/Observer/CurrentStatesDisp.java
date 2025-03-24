package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

public class CurrentStatesDisp implements Display,Observer {
    private float temprature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentStatesDisp(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Current States Display");
        System.out.println("Temprature: " + temprature + " Humidity: " + humidity + " Pressure: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temprature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

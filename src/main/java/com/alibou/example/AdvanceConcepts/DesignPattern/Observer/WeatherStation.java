package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData ws = new  WeatherData();
        CurrentStatesDisp currentStatesDisp = new CurrentStatesDisp(ws);

        ws.setMeasurements(63.5f,40.2f,632f);

        ws.setMeasurements(61.5f,4.2f,63f);

        ws.removeObserver(currentStatesDisp);

        ws.setMeasurements(10.0f,45.2f,55f);
    }
}

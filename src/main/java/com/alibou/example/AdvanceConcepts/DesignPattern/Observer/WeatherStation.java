package com.alibou.example.AdvanceConcepts.DesignPattern.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrDisplay currDisplay = new CurrDisplay(weatherData);
        //aftersometime weatherdata got changed
        weatherData.setMeasurements(38.5f,818.2f,23.5f);
        weatherData.setMeasurements(3.5f,18.2f,3.5f);
        weatherData.removeObserver(currDisplay);
        //afterobserver removed nothing printed
        weatherData.setMeasurements(7.5f,7f,4f);
        weatherData.notifyObservers();
    }
}

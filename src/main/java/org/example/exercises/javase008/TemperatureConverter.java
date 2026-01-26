package org.example.exercises.javase008;

public class TemperatureConverter {
    private double celsius;

    public TemperatureConverter(double celsius){
        setCelsius(celsius);
    }



    public double getCelsius() {
        return celsius;
    }

    public double getFarenheit(){
        return celsius*9/5+32;
    }

    public double getKelvin(){
        return celsius+273.15;
    }

    public void setCelsius(double celsius) {
        if(celsius<-273.15){
            System.out.println("Temperature shouldn't be less than -273.15");
            return;
        }
        this.celsius = celsius;
    }
}

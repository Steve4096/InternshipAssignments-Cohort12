package org.example.exercises.javase009.exercise2;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void start(){}

    public void stop(){}

    public void getInfo(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}

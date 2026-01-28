package org.example.exercises.javase009.exercise2;

public class Truck extends Vehicle{
    private String loadCapacity;

    public Truck(String make,String model,int year,String loadCapacity){
        super(make, model, year);
        this.loadCapacity=loadCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Load capacity: "+loadCapacity);
    }
}

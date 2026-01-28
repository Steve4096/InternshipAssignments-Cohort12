package org.example.exercises.javase009.exercise2;

public class Car extends Vehicle{
    private int doors;

    public Car(String make,String model,int year,int doors){
        super(make, model, year);
        this.doors=doors;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Doors: "+doors);
    }
}

package org.example.exercises.javase009.exercise2;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle(String make,String model,int year,boolean hasSideCar){
        super(make, model, year);
        this.hasSideCar=hasSideCar;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Has side car: "+hasSideCar);
    }
}

package org.example.exercises.javase011.exercise1;

public abstract class Shape {
    private String color;
    private int filledFields;


    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString(){
        return "Shape{color: '"+color+"',FilledFields: '"+filledFields+"'}";
    }
}

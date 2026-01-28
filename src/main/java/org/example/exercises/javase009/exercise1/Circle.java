package org.example.exercises.javase009.exercise1;

public class Circle extends Shape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}

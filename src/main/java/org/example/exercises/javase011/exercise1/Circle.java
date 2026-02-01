package org.example.exercises.javase011.exercise1;

public class Circle extends Shape {
    private double radius;

    @Override
    public double getPerimeter() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}

package org.example.exercises.javase011.exercise1;

public class Triangle extends Shape {
    private int base;
    private int height;

    @Override
    public double getPerimeter() {
        return base+height;
    }

    @Override
    public double getArea() {
        return base*height;
    }
}

package org.example.exercises.javase011.exercise1;

public class Rectangle extends Shape{
    private int width;
    private int height;

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}

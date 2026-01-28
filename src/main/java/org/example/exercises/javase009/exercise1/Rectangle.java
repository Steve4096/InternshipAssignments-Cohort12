package org.example.exercises.javase009.exercise1;

public class Rectangle extends Shape {
    private int width;
    private int height;

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }
}

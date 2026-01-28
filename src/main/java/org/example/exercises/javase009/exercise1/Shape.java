package org.example.exercises.javase009.exercise1;

public class Shape {
    private String color;
    private boolean filled;

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{color: '"+color+"',filled: '"+filled+"'}";
    }
}

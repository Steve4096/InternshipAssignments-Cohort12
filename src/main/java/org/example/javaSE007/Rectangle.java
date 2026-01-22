package org.example.javaSE007;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(double size){
        this.width=size;
        this.height=size;
    }

    public double calculateArea(){
        return height*width;
    }

    public double calculatePerimeter(){
        double perimeter=(height*2)+(width*2);
        return perimeter;
    }

    public double getWidth(){return width;}

    public double getHeight(){return height;}

    public void setWidth(double width){
        if(width>0){
            this.width=width;
        }else {
            System.out.println("Width can't be 0");
        }
    }

    public void setHeight(double height){
        if(height>0){
            this.height=height;
        }else {
            System.out.println("Height can't be 0");
        }
    }

}

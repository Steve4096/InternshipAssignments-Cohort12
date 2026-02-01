package org.example.assignments.assessment3_SteveMuturi.quiz3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;

    public Product(String productId,String name,double price){
        if(price<=0){
            throw new InvalidFormatException("Price can't be less than 0");
        }
        this.price=price;
        if(!name.matches("[A-Za-z ]+")){
            throw new InvalidFormatException("Name should only contain letters");
        }
        this.name=name;
        this.productId=productId;
    }

    public abstract double calculateDiscount();

    public abstract String getProductType();

    public double applyTax(){
        return 0.1*price;
    }

    public void displayProductInfo(){
        System.out.println("Product ID: "+productId);
        System.out.println("Product name: "+name);
        System.out.println("Price: "+price);
    }
}

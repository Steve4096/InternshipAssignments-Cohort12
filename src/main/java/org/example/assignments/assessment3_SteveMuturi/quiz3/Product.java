package org.example.assignments.assessment3_SteveMuturi.quiz3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String productId,String name,double price,int stock){
        if(price<=0){
            throw new InvalidFormatException("Price can't be less than 0");
        }
        this.price=price;
        if(!name.matches("[A-Za-z ]+")){
            throw new InvalidFormatException("Name should only contain letters");
        }
        if(stock<0){
            throw new InvalidFormatException("Stock can't be less than 0");
        }
        this.stock=stock;
        this.name=name;
        this.productId=productId;
    }

    public abstract double calculateDiscount();

    public abstract String getProductType();

    public void reduceStock(int quantity){
        if (quantity>stock){
            throw new OutOfStockException("The quantity is greater than the available stock");
        }
        stock-=quantity;
    }

    public double applyTax(){
        return 0.1*price;
    }

    public void displayProductInfo(){
        System.out.println("Product ID: "+productId);
        System.out.println("Product name: "+name);
        System.out.println("Price: "+price);
    }
}

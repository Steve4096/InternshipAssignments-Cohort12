package org.example.assignments.assessment3_SteveMuturi.quiz3;

public class Clothing extends Product {
    private int size;
    private String material;
    private String color;

    public Clothing(String productId,String name,double price,int stock,int size,String material,String color){
        super(productId, name, price,stock);
        this.material=material;
        this.color=color;
        this.size=size;
    }

    @Override
    public String getProductType() {
        return "Clothing";
    }

    @Override
    public double calculateDiscount() {
        return 0.15*price;
    }
}

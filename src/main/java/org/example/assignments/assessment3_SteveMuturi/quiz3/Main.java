package org.example.assignments.assessment3_SteveMuturi.quiz3;

public class Main {
    public static void main(String[] args) {
        try {
            Product clothing=new Clothing("CL001","Boxer",2000,200,"Medium","Cotton","Black");
            clothing.displayProductInfo();
            clothing.purchase(100);
            Product electronic=new Electronics("EL001","Lenovo laptop",50_000,200,24,50);
            electronic.displayProductInfo();
        }catch (InvalidFormatException | OutOfStockException exception){
            System.out.println("Error, "+exception.getMessage());
        }
    }
}

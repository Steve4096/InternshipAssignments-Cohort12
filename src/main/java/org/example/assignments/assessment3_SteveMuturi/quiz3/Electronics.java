package org.example.assignments.assessment3_SteveMuturi.quiz3;

public class Electronics extends Product  {
    private int warrantyPeriod;
    private double powerConsumption;

    public Electronics(String productId,String name,double price,int stock,int warrantyPeriod,double powerConsumption){
        super(productId, name, price,stock);
        this.warrantyPeriod=warrantyPeriod;
        setPowerConsumption(powerConsumption);
    }

    public void setPowerConsumption(double powerConsumption) {
        if(powerConsumption<0){
            throw new InvalidFormatException("Power consumed can't be less than 0");
        }
        this.powerConsumption=powerConsumption;
    }

    @Override
    public double calculateDiscount() {
        return 0.1*price;
    }

    @Override
    public String getProductType() {
        return "Electronic";
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Product type: "+getProductType());
        System.out.println("Discount: "+calculateDiscount());
        System.out.println("Price after discount: "+(price-calculateDiscount()+applyTax()));
    }
}

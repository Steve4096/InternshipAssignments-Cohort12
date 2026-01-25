package org.example.assignments.assessment2_SteveMuturi.quiz3_calculator;

public class ScientificCalculator extends Calculator{
    @Override
    public int add(int a, int b) {
        int sum=a+b;
        System.out.println("Summation of " +a+ " and " +b+ " is: "+sum);
        return super.add(a, b);
    }

    public double power(double base,double exponent){
        return Math.pow(base,exponent);
    }

    public double squareRoot(double number){
        return Math.sqrt(number);
    }
}

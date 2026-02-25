package org.example.exercises.lambda.exercise1;

public class Test {
    public static void main(String[] args) {
        Calculator calculator=(a, b)->a+b;
        System.out.println(calculator.add(12,23));

        Transformer transformer=(s)->s.toUpperCase();
        System.out.println(transformer.toUpperCase("Steve"));

        Validator validator=s->{
            if(s.length()<5){
                System.out.println("Value should be greater than 5 characters");
                return false;
            }
            return true;
        };
        System.out.println(validator.validate("Steve"));

        Logger logger=()-> System.out.println("Hello Steve");
        logger.display();
    }
}

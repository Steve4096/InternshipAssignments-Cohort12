package org.example;

import java.util.Scanner;

public class ControlFlow {

    static Scanner scanner=new Scanner(System.in);

    public static void ageCategory(){
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        String category;
        if(age<2){
            category ="infant";
        } else if (age<=12) {
            category="child";
        } else if (age<=19) {
            category="teenager";
        } else if (age<=64) {
            category="adult";
        }else {
            category="adult";
        }
        System.out.println("Category: "+category);
    }

    public static void oldSwitchMethod(){
        int day=5;
        String dayname;
        switch (day){
            case 1:
                dayname="Sunday";
                break;
            case 2:
                dayname="Monday";
                break;
            case 3:
                dayname="Tuesday";
                break;
            case 4:
                dayname="Wednesday";
                break;
            case 5:
                dayname="Thursday";
                break;
            case 6:
                dayname="Friday";
                break;
            default:
                dayname="Saturday";
        }
        System.out.println("Day "+day+" is "+dayname);
    }

    public static void calculator(){
        System.out.println("Enter first number:");
        double a= scanner.nextDouble();
        System.out.println("Enter second number;");
        double b= scanner.nextDouble();
        System.out.println("Enter operator(+,-,*,/,%;");
        char operator=scanner.next().charAt(0);
        if((operator=='/' || operator=='%') && b==0){
            System.out.println("Cannot perform division/modulus if the second number is 0");
            return;
        }
        double result=switch (operator){
            case '+' ->a+b;
            case '-' ->a-b;
            case '*' ->a*b;
            case '/' ->a/b;
            case '%' ->a%b;
            default ->
                //System.out.println("Error.Invalid number");
                throw new ArithmeticException("Invalid operation");
        };
        System.out.println("Number 1: "+a+","+" Number 2:"+b+" operator: "+operator);
        System.out.println("Result is: "+result);
    }

    public static void trafficLightSystem(){
        System.out.println("Enter a colour among these(red,yellow,green,blinking yellow,blinking red");
        String colour=scanner.nextLine().toLowerCase();
        String significance=switch (colour){
            case "red"-> "STOP";
            case "yellow"->"PREPARE TO STOP";
            case "green"->"GO";
            case "blinking red"-> "TREAT AS STOP SIGN";
            case "blinking yellow"->"PROCEED WITH CAUTION";
            default -> "Invalid light colour";
        };
        System.out.println("COLOR: "+ colour+" SIGNIFICANCE: "+significance);
    }
}

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
        scanner.close();
    }

    public static void oldSwitchMethod(){
        int day=5;
        String dayName;
        switch (day){
            case 1:
                dayName="Sunday";
                break;
            case 2:
                dayName="Monday";
                break;
            case 3:
                dayName="Tuesday";
                break;
            case 4:
                dayName="Wednesday";
                break;
            case 5:
                dayName="Thursday";
                break;
            case 6:
                dayName="Friday";
                break;
            default:
                dayName="Saturday";
        }
        System.out.println("Day "+day+" is "+dayName);
    }

    public static void calculator(){
        System.out.println("Enter first number:");
        double a= scanner.nextDouble();
        System.out.println("Enter second number;");
        double b= scanner.nextDouble();
        System.out.println("Enter operator(+,-,*,/,%)");
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
            default -> throw new ArithmeticException("Invalid operation");
        };
        System.out.println("Number 1: "+a+","+" Number 2:"+b+" operator: "+operator);
        System.out.println("Result is: "+result);
    }

    public static void calculatorWithOldSwitchMethod() {
        System.out.println("Enter first number:");
        double a = scanner.nextDouble();
        System.out.println("Enter second number;");
        double b = scanner.nextDouble();
        System.out.println("Enter operator(+,-,*,/,%;");
        char operator = scanner.next().charAt(0);
        double result=0;
        switch (operator){
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                if(b==0) {
                    System.out.println("Cannot perform division/modulus if the second number is 0");
                    return;
                }
                else result=a/b;
                break;
            case '%':
                if(b==0) {
                    System.out.println("Cannot perform division/modulus if the second number is 0");
                    return;
                }
                else result=a%b;
                break;
            default:System.out.println("Invalid operator");
        }
        System.out.println("Result is:"+result);
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

    public static void simpleMenuSystemUsingOldSwitchMethod(){
        System.out.println("WELCOME TO TEVIN SOFTWARE COMPANY. WHAT SERVICE CAN WE ASSIST YOU WITH?");
        System.out.println("1.Website development");
        System.out.println("2.Database development");
        System.out.println("3.App development");
        System.out.println("4.Data analysis");
        System.out.println("5.Training/Tutoring");
        String result="Choice";
        System.out.println("Enter your preferred option");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                result="Website development";
                break;
            case 2:
                result="Database development";
                break;
            case 3:
                result="App development";
                break;
            case 4:
                result="Data analysis";
                break;
            case 5:
                result="Training/Tutoring";
                break;
            default:
                System.out.println("Invalid choice.Please select one from the list");
                return;
        }
        System.out.println("You have chosen: "+result);
    }

    public static void simpleMenuSystemUsingNewSwitchMethod(){
        System.out.println("WELCOME TO TEVIN SOFTWARE COMPANY. WHAT SERVICE CAN WE ASSIST YOU WITH?");
        System.out.println("1.Website development");
        System.out.println("2.Database development");
        System.out.println("3.App development");
        System.out.println("4.Data analysis development");
        System.out.println("5.Training/Tutoring");
        //String option;
        System.out.println("Enter your preferred option");
        int choice=scanner.nextInt();
        String result=switch (choice){
            case 1 -> "Website development";
            case 2 -> "Database development";
            case 3 -> "App development";
            case 4 -> "Data analysis";
            case 5 -> "Training/Tutoring";
            default -> "Invalid choice.Please select one from the list";
        };
       System.out.println("You have chosen: "+result);
    }
}

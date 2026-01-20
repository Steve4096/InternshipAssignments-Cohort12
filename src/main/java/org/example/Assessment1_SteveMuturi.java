package org.example;

import java.util.Scanner;

public class Assessment1_SteveMuturi {

    static Scanner scanner=new Scanner(System.in);

    //Quiz 1
    public static void variableOperations(){
        int a=15,b=4,c=7;
        int sum=a+b+c;
        int product=a*b;
        int combinedOperation=(a+b)*c;
        int remainder=a%b;
        System.out.println("Sum is: "+sum);
        System.out.println("Product is: "+product);
        System.out.println("Expression result is: "+combinedOperation);
        System.out.println("Remainder is: "+remainder);
    }

    //Quiz 2
    public static void gradeCalculator(){
        String grade;
        while (true){
            System.out.println("Enter studentScore");
            int score=scanner.nextInt();
            if(score<0 || score>100){
                System.out.println("Score must be between 0 and 100");
                continue;
            }
            if(score>=90)grade="A";
            else if (score>=80) grade="B";
            else if (score>=70) grade="C";
            else if (score>=60) grade="D";
            else grade="F";
            System.out.println("Student grade is: "+grade);
            break;
        }
    }

    //Quiz 3
    public static void numberSequence() {
        for(int i=1;i<=20;i++){
            if(i%2==0 && i%5==0){
                System.out.println(i+" - "+"Even"+","+"Multiple of 5");
            } else if (i%2==0) {
                System.out.println(i+" - "+"Even");
            } else if (i%5==0 && i%2!=0) {
                System.out.println(i+" - "+"Odd"+","+"Multiple of 5");
            }else {
                System.out.println(i+" - "+"Odd");
            }
        }
    }

    //Quiz 4
//    public static void inputValidation() {
//        //boolean isPositive=false;
//        int factorial;
//        do{
//            System.out.println("Enter a positive number:");
//            int x = scanner.nextInt();
//           if(x<0){
//               System.out.println("Invalid input. Enter a positive number.");
//               continue;
//           }
//        }while (true);
//    }

    //Quiz 5
    public static void rightAngledTrianglePatternPrinting() {
        for(int i=1;i<=5;i++){
           //for (int j=1;j<=5;j++){
             //   System.out.println("");
            //}
           for (int k=1;k<=i;k++){
               System.out.print("*");
           }
            System.out.println();
        }
    }

    public static void pyramidPatternPrinting(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void calculator(){
        double result=0,a,b=0;
        boolean running=true;
        do{
            calculatorMenu();
            System.out.println("Enter your choice(1-8)");
            int choice=scanner.nextInt();
            if(choice==7){
                System.out.println("Enter the number:");
                a=scanner.nextInt();
            } else if (choice==8) {
                System.out.println("Thank you for using simple calculator");
                System.out.println("Exiting the system.");
                return;
            }else if(choice>8) {
                System.out.println("Invalid choice.Please select from the menu below.");
                continue;
            }else {
                    System.out.println("Enter the first number:");
                    a= scanner.nextDouble();
                    System.out.println("Enter the second number:");
                    b= scanner.nextDouble();
                }
            if((b==0) && (choice==4 || choice==5)){
                System.out.println("Cannot perform division/modulus if the second number is 0.");
                System.out.println("Please enter another number or choose another operation.");
                continue;
            }
            switch (choice){
                case 1 -> result=a+b;
                case 2 -> result=a-b;
                case 3 -> result=a*b;
                case 4 -> result=a/b;
                case 5 -> result=a%b;
                case 6 -> result=Math.pow(a,b);
                case 7 -> result=Math.sqrt(a);
                default -> System.out.println("Invalid choice.Please select one from the menu below.");
            }
            System.out.println("Result is:"+result);
            System.out.println("Would you like to continue(y/n)");
            char c=scanner.next().charAt(0);
            if(c=='y')running=true;
            else {
                System.out.println("Thank you for using simple calculator");
                System.out.println("Exiting the system.");
                running=false;
                scanner.close();
            }
        }while (running);
        scanner.close();
    }

    private static void calculatorMenu(){
        System.out.println("==Simple Calculator==");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("6.Power");
        System.out.println("7.Square root");
        System.out.println("8.Exit");
    }


}

package org.example;

import java.util.Scanner;

public class Calculator {
    public static void mathematicalOperations(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number a:");
        int a=scanner.nextInt();
        System.out.println("Enter a number b:");
        int b= scanner.nextInt();
        System.out.println("Sum is: "+(a+b));
        System.out.println("Difference is: "+(a-b));
        System.out.println("Product is: "+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Remainder is:"+a%b);
        scanner.close();
    }

    public static void studentInformation(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your age:");
        int age= scanner.nextInt();
        System.out.println("Enter your grade:");
        int grade= scanner.nextInt();
        boolean isPass;
        //if(grade>75) isPass=true;
        //else isPass=false;
        isPass=grade>75;
        System.out.println("Student details");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        System.out.println("Pass: "+isPass);
        scanner.close();
    }

    public static void bmiCalculator(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your mass in kg:");
        double mass= scanner.nextDouble();
        System.out.println("Enter your height in centimetres:");
        int height= scanner.nextInt();
        double actualHeight=(height/100.0)*(height/100.0);
        double BMI=mass/actualHeight;
        System.out.println("Your BMI is: "+BMI);
    }

    public static void dailySavings(){
        int sum=0;
        for (int i=1;i<=365;i++){
            sum+=i;
            System.out.println("Amount to save at day "+i+" is "+i);
            System.out.println("Total saved is: "+sum);
        }
    }
}

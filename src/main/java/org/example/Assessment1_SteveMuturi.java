package org.example;

import java.util.Scanner;

public class Assessment1_SteveMuturi {

    static Scanner scanner=new Scanner(System.in);

    //Quiz 1
    public static void variableOperations(){
        int a=15,b=4,c=7;
        int sum=a+b+c;
        int product=a*b;
        double combinedOperation=(a+b)*c;
        double remainder=a%b;
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


}

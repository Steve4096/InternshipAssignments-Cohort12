package org.example.Assesments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean running=true;
        while (running){
            printMenu();
            System.out.println("Select a project to run");
            if(!scanner.hasNextInt()){
                System.out.println("Invalid input. Please select from the menu below");
                scanner.next();
                continue;
            }
            int x= scanner.nextInt();
             switch (x){
                 case 1 -> Assessment1_SteveMuturi.variableOperations();
                 case 2 -> Assessment1_SteveMuturi.gradeCalculator();
                 case 3 -> Assessment1_SteveMuturi.numberSequence();
                 case 4 -> Assessment1_SteveMuturi.inputValidation();
                 case 5 -> Assessment1_SteveMuturi.rightAngledTrianglePatternPrinting();
                 case 6 -> Assessment1_SteveMuturi.calculator();
                 case 7 ->{
                     System.out.println("Exiting");
                     running=false;
                 }
                 default -> System.out.println("Invalid choice.Please select one from the menu above");
             }
            System.out.println();
        }
        scanner.close();
    }

    private static void printMenu(){
        System.out.println("==MENU==");
        System.out.println("1.Operations on variables");
        System.out.println("2.Grade calculator");
        System.out.println("3.Number sequence");
        System.out.println("4.Input validation");
        System.out.println("5.Pattern printing(Right-angled triangle");
        System.out.println("6.Simple Calculator");
        System.out.println("7.Exit");
    }
}

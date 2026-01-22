package org.example;

import java.util.Arrays;

public class Methods {

    public static int add(int a,int b){
        System.out.println("Result is:"+(a+b));
        return a+b;
    }

    public static int subtract(int a,int b){
        System.out.println("Result is:"+(a-b));
        return a-b;
    }

    public static int multiply(int a,int b){
        System.out.println("Result is:"+a*b);
        return a*b;
    }

    public static double divide(double a,double b){
        if(b==0){
            System.out.println("Cannot divide if the second number is 0");
        }else {
            System.out.println("Result is:"+a/b);
        }
        return a/b;
    }

    public static double celsiusToFarenheit(double temperature){
        double temp=(temperature*9/5)+32;
        return temp;
    }

    public static double farenheitToCelsius(double temperature){
        double temp=(temperature-32)*5/9;
        return temp;
    }

    public static void printTemperatureTable(){
        System.out.println("Temperature conversion table");
        for (int i=0;i<=100;i+=10){
            System.out.println(i);
        }
    }

    public static void manageStudentGrades(int[] grades){
        int sum=0;

        for(int i=0;i<grades.length;i++){
            sum+=grades[i];
        }

        int average=sum/ grades.length;

        int highestGrade =grades[0];
        for (int i=1;i<grades.length;i++){
            if(grades[i]> highestGrade) highestGrade =grades[i];
        }

        int lowestGrade =grades[0];
        for (int i=1;i<grades.length;i++){
            if(grades[i]< lowestGrade) lowestGrade =grades[i];
        }

        String letterGrade;
        if(average>=90) letterGrade="A";
        else if (average>=80) letterGrade="B";
        else if (average>=70) letterGrade="C";
        else if (average>=60) letterGrade="D";
        else if (average>=50) letterGrade="E";
        else letterGrade="F";

        System.out.println("Grades:"+ Arrays.toString(grades));
        System.out.println("Average:"+average);
        System.out.println(letterGrade);
        System.out.println("Highest score:"+highestGrade);
        System.out.println("Lowest score:"+lowestGrade);
    }

    public static void manageStudentGradesUsingForEachLoop(int[] grades){
        int highestGrade=grades[0];
        int lowestGrade=grades[0];
        int sum=0;

        for(int grade:grades){
            sum+=grade;

            if(grade>highestGrade){
                highestGrade=grade;
            }

            if(grade<lowestGrade){
                lowestGrade=grade;
            }
        }

        int average=sum/grades.length;

        System.out.println("Grades:"+ Arrays.toString(grades));
        System.out.println("Average:"+average);
        //System.out.println(letterGrade);
        System.out.println("Highest score:"+highestGrade);
        System.out.println("Lowest score:"+lowestGrade);
    }

    public static void convertToUppercase(String[] fruits){
        String[] fruitsInUppercase=new String[fruits.length];

        int i=0;
        for(String fruit:fruits){
            fruitsInUppercase[i]=fruit.toUpperCase();
            i++;
           // fruit.toUpperCase();
        }
        System.out.println(Arrays.toString(fruitsInUppercase));
    }
}

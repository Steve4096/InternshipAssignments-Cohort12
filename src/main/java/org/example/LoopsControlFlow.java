package org.example;

import java.util.Scanner;

public class LoopsControlFlow {

    static Scanner scanner=new Scanner(System.in);

    public static void multiplicationTable(){
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        for(int i=0;i<=15;i++){
            int result=number*i;
            System.out.println(number+" x "+i+" ="+result);
        }
    }

    public static void calculator(){
        int i,sum=0,count=0;
        do{
            System.out.println("Enter a number:");
            i=scanner.nextInt();
            if(i<0)continue;
            if(i==0)break;
            sum+=i;
            count++;
        }while (true);
        scanner.close();
        if(count>0){
           double average=(double) sum/count;
            System.out.println("Count is: "+count+" Sum is: "+sum+" Average is: "+average);
        }else {
            System.out.println("No positive integers were entered");
        }
    }

//    public static void primeNumberChecker() {
//        boolean isPrime=true;
//        do{
//            System.out.println("Enter a number");
//            int i= scanner.nextInt();
//            if(i<=1) isPrime=false;
//            for (int s=2;s==Math.sqrt(i);s++){
//                if(i%s==0){
//                    isPrime=false;
//                }
//                System.out.println("Number "+i+" isPrime:"+isPrime);
//            }
//        } while (true);
//    }

    public static void primeNumberChecker() {
        while (true) {
            System.out.println("Enter a number (or 0 to stop):");
            int i = scanner.nextInt();

            if (i == 0) {
                System.out.println("Exiting prime checker.");
                break; // stop the loop if 0 is entered
            }

            if (i <= 1) {
                System.out.println(i + " is not a prime number.");
                continue; // skip to next input
            }

            boolean isPrime = true; // assume the number is prime

            // check divisibility from 2 up to sqrt(i)
            for (int s = 2; s <= Math.sqrt(i); s++) {
                if (i % s == 0) {
                    isPrime = false; // found a divisor, not prime
                    break; // no need to check further
                }
            }

            if (isPrime) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }

}

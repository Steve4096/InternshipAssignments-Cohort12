package org.example.exercises.javase016.exercise1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a set of words:");
        String words= scanner.nextLine();
        scanner.close();
        UniqueWordCounter.wordCounter(words);
    }




}

package org.example.exercises.javase016.exercise1;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueWordCounter {


    public static void wordCounter(String... words){
        Set<String> hashSet=new HashSet<>();
        System.out.println("==HASH-SET==");
        for(String word:words){
            hashSet.add(word.toLowerCase());
        }
        System.out.println("Words: "+hashSet);
        System.out.println("Count: "+hashSet.size());


        System.out.println("==LINKED-HASH-SET==");
        Set<String> linkedHashSet=new LinkedHashSet<>();
        for (String word:words){
            linkedHashSet.add(word.toLowerCase());
        }
        System.out.println("Words: "+linkedHashSet);
        System.out.println("Count: "+linkedHashSet.size());
    }
}

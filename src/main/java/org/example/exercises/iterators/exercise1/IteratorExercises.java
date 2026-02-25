package org.example.exercises.iterators.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorExercises {

    public static void filterEvenNumbers(){
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);
        java.util.Iterator<Integer> integerIterator= numbers.iterator();
        while (integerIterator.hasNext()){
            int num= integerIterator.next();
            if (num%2==0){
                System.out.println(num);
            }
        }
    }

    public static void removeShortStrings(){
        //List<String> stringList=List.of("Oi","Lion","Dog","Bo","Egg","Elephant","Ee");
        //List<String> stringList= Arrays.asList("Oi","Lion","Dog","Bo","Egg","Elephant","Ee");
        List<String> stringList=new ArrayList<>(Arrays.asList("Oi","Lion","Dog","Bo","Egg","Elephant","Ee"));
        java.util.Iterator<String> stringIterator= stringList.iterator();
        while (stringIterator.hasNext()){
            String s= stringIterator.next();
            if(s.length()<3){
                stringIterator.remove();
            }
        }
        System.out.println(stringList);
    }

    public static void filterByGrade(){

    }

    public static void safeElementRemoval(){
        //List<String> fruits= List.of("Banana","Melon","Onion","Apple","Avocado");
        //List<String> fruits= Arrays.asList("Banana","Melon","Onion","Apple","Avocado");
        List<String> fruits=new ArrayList<>(Arrays.asList("Banana","Melon","Onion","Apple","Avocado"));
        java.util.Iterator<String> fruitsIterator= fruits.iterator();
        while (fruitsIterator.hasNext()){
            String fruit=fruitsIterator.next();
            if (fruit.equals("Onion")){
                fruitsIterator.remove();
            }
        }
        System.out.println(fruits);
    }




}

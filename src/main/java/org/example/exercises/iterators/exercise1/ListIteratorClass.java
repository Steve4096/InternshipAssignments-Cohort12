package org.example.exercises.iterators.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {
    List<String> cities=new ArrayList<>();


    public void listIteratorExercises(){
        ListIterator<String> stringListIterator= cities.listIterator();
        cities.add("Nairobi");
        cities.add("Kisumu");
        cities.add("Mombasa");
        cities.add("Nakuru");
        cities.add("Eldoret");

        //Forward traversal

    }
}

package org.example.exercises.javase018.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Stack <Datatype>{
    private List<Datatype> contents=new ArrayList<>();

    public void push(Datatype content){
        contents.add(0,content);
    }

    public void pop(){
        contents.getLast();
    }

    public Datatype peek(){
        return contents.get(0);
    }

    public List<Datatype> returnAllElements(){
        return contents;
    }
}

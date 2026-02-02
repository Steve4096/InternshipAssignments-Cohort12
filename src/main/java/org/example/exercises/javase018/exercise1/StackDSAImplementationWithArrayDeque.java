package org.example.exercises.javase018.exercise1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class StackDSAImplementationWithArrayDeque<Datatype> {
    Deque<Datatype> contents=new ArrayDeque<>();

    public void push(Datatype content){
        contents.push(content);
    }

    public Datatype pop(){
       return contents.pop();
    }

    public Datatype peek(){
        return contents.peek();
    }

    public List<Datatype> returnAllElements(){
        return List.copyOf(contents);
    }
}

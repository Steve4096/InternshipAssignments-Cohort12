package org.example.exercises.javase018.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Stack <Datatype>{
    private List<Datatype> contents=new ArrayList<>();

    public void push(Datatype content){
        contents.add(content);
    }

    public void pushMultipleElements(Datatype...content){
        for (Datatype item:content){
            contents.add(item);
        }
    }

    public Datatype pop(){
        if(contents.isEmpty()){
            return null;
        }
        return contents.remove(contents.size()-1);
    }

    public Datatype peek(){
        return contents.get(contents.size()-1);
    }

    public List<Datatype> returnAllElements(){
        return List.copyOf(contents);
    }
}

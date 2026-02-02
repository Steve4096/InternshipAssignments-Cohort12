package org.example.exercises.javase018.exercise1;

import java.util.*;

public class Queue<DataType> {
    private List<DataType> contents=new LinkedList<>();

    public List<DataType> getContents(){
        return contents;
    }

    public void enqueueMultipleRecords(DataType... records){
        for (DataType record:records){
            contents.add(record);
        }
    }

    public void enqueue(DataType content){
        contents.add(content);
    }

    public DataType dequeue(){
        if(contents.isEmpty()){
            return null;
        }
        return contents.remove(0);
    }
}

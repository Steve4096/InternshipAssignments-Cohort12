package org.example.exercises.javase018.exercise1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDSAImplementation <Datatype>  {
    private Queue<Datatype> queue=new LinkedList<>();

    public Queue<Datatype> getQueue() {
        return queue;
    }

    public void enqueue(Datatype content) {
        queue.offer(content);
    }


    public void enqueueMultipleRecords(Datatype...records) {
        for (Datatype item:records){
            queue.offer(item);
        }
    }

    public Queue<Datatype> getContents() {
        return queue;
    }

    public Datatype dequeue() {
       return queue.poll();
    }

    public Datatype peek(){
        return queue.peek();
    }
}

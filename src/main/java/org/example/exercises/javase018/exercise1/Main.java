package org.example.exercises.javase018.exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue<String> stringQueue=new Queue<>();
//        stringQueue.enqueue("Steve");
//        stringQueue.enqueue("Tamiron");
//        stringQueue.enqueue("Abednego");
//        stringQueue.enqueue("Joy");
//        stringQueue.enqueue("Tricia");
//        stringQueue.getContents();
//        stringQueue.dequeue("Tricia");
//        //stringQueue.dequeue("Tricia");
//        System.out.println("After dequeueing");
//        stringQueue.getContents();
        Queue<Integer> integerQueue=new Queue<>();
        integerQueue.enqueueMultipleRecords(1,2,3,4,5);
        integerQueue.enqueue(6);
        System.out.println(integerQueue.getContents());
        System.out.println("Removed element: "+integerQueue.dequeue());
        System.out.println("After dequeueing");
        System.out.println(integerQueue.getContents());

    }
}

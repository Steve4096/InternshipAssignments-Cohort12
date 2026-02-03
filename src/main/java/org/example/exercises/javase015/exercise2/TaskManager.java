package org.example.exercises.javase015.exercise2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TaskManager {
    LinkedList<Task> tasksList =new LinkedList<>();

    public void addTask(Task task){
        tasksList.addFirst(task);
    }

    public void addTasks(Task...tasks){
        tasksList.addAll(List.of(tasks));
    }

    public Task getNextTaskFromList(){
        return tasksList.isEmpty()? null:tasksList.getFirst();
    }

    public Task getNextTaskFromQueue(){
        return tasksList.peek();
    }

    public void completeTaskInList(String id){
        for (Task task:tasksList){
            if(task.getId().equals(id)){
                task.setiSCompleted(true);
                break;
            }
        }
    }

    public void displayTasks() {
        for(Task task:tasksList){
            System.out.println("Task: "+task);
        }
    }
}

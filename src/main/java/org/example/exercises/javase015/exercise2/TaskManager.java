package org.example.exercises.javase015.exercise2;

//Add sorting based on priority

import java.util.LinkedList;
import java.util.List;

public class TaskManager {
    List<Task> tasksList =new LinkedList<>();

    public void addTask(Task task){
        tasksList.addLast(task);
    }

    public void addTasks(Task...tasks){
        tasksList.addAll(List.of(tasks));
    }

    public Task peekNextTask(){
        return tasksList.isEmpty()? null:tasksList.getFirst();
    }

//    public Task pollNextTask(){
//        return tasksList.poll();
//    }

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

package org.example.exercises.javase015.exercise2;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task task = new Task("T001", "Fix the internet", Priority.HIGH);
        Task task1 = new Task("T002", "Finish the practical exercises", Priority.HIGH);
        Task task2 = new Task("T003", "Go through generics again", Priority.HIGH);
        Task task3 = new Task("T004", "Go through the other notes", Priority.MID);
        taskManager.addTask(task);
        taskManager.displayTasks();
        taskManager.addTasks(task1, task2, task3);
        taskManager.displayTasks();
        System.out.println("First task in Queue");
        System.out.println(taskManager.getNextTaskFromQueue());
        System.out.println("First task in List");
        System.out.println(taskManager.getNextTaskFromList());
        taskManager.completeTaskInList("T001");
        taskManager.displayTasks();
    }
}


package org.example.exercises.javase015.exercise2;

public class Task {
    private String id;
    private String description;
    private Priority priority;
    private boolean isCompleted;

    public Task(String id,String description,Priority priority){
        setId(id);
        setDescription(description);
        setPriority(priority);
        setiSCompleted(false);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setiSCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Task{id:'"+id+" ',Description: '"+description+" ',Priority:'"+priority+"',isCompleted:'"+isCompleted+"'}";
    }
}

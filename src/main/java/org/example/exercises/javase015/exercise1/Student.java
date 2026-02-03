package org.example.exercises.javase015.exercise1;

public class Student {
    private String id;
    private String name;
    private char grade;

    public Student(String id,String name,char grade){
        setId(id);
        setName(name);
        setGrade(grade);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

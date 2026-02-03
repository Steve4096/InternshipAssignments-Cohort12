package org.example.exercises.javase015.exercise1;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        Student student=new Student("S001","Steve",'A');
        Student student1=new Student("S002","Abednego",'A');
        Student student2=new Student("S003","Gloria",'B');
        studentManager.addStudent(student);
        studentManager.addMultipleStudents(student1,student2);
        System.out.println("GET ALL STUDENTS");
        System.out.println(studentManager.getStudents());
        System.out.println("Display All students");
        studentManager.displayAllStudents();
    }
}

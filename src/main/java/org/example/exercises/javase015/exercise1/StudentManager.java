package org.example.exercises.javase015.exercise1;

import java.util.ArrayList;
import java.util.List;

//Add sorting

public class StudentManager {

   private List<Student> students=new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void addMultipleStudents(Student...studentRecords){
        students.addAll(List.of(studentRecords));
    }

    public void removeStudent(String id){
        students.removeIf(student -> student.getId().equals(id));
    }

    public Student findStudent(String id){
        for(Student student:students){
           if(student.getId().equals(id)){
               return student;
            }
        }
        return null;
    }


    public List<Student> getStudents() {
        return List.copyOf(students);
    }

    public void displayAllStudents(){
        for (Student student:students){
            System.out.println(student);
        }
    }
}

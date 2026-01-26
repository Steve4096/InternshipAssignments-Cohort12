package org.example.exercises.javase008;

public class StudentMain {
    public static void main(String[] args) {
        String id="23e";
        String name="Steve";
        int age=108;
        double gpa=4.0;

        Student student=new Student(id,name,age,gpa);
        student.displayInfo();
    }
}

package org.example.exercises.javase008;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public Student(String studentId,String name,int age,double gpa){
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentId(String studentId) {
        if(studentId.length()<6 || !studentId.matches("[A-Za-z0-9]{6}")){
            System.out.println("Student ID should contain atleast 6 alphanumeric characters");
            return;
        }
        this.studentId = studentId;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.length()<2){
            System.out.println("Name should be atleast 2 characters");
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age<16 || age>100){
            System.out.println("Student age should be between 16 and 100");
            return;
        }
        this.age = age;
    }

    public void setGpa(double gpa) {
        if(gpa<0.0 || gpa>4.0){
            System.out.println("GPA should be between 0 and 4");
            return;
        }
        this.gpa = gpa;
    }

    public void displayInfo(){
        System.out.println("Student ID is: "+studentId);
        System.out.println("Student name is: "+name);
        System.out.println("Student age is: "+age);
        System.out.println("Student gpa is: "+gpa);
    }
}


package org.example.exercises.javase009.exercise3;

public class Student extends UniversityPerson {
    private String major;
    private double gpa;

    public Student(String id,String name,String email,String major,double gpa){
        super(id, name, email);
        setMajor(major);
        setGpa(gpa);
    }

    public String getMajor(){
        return major;
    }

    public double getGpa(){
        return gpa;
    }

    public void setMajor(String major) {
        if(!major.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Major should only contain letters");
        }
        this.major=major;
    }

    public void setGpa(double gpa){
        if (gpa<0 || gpa>4){
            throw new IllegalArgumentException("Gpa should be within range(0-4)");
        }
        this.gpa=gpa;
    }

    @Override
    public String toString() {
        return super.toString()+"{major:'"+major+"',gpa:'"+gpa+"'}";
    }
}

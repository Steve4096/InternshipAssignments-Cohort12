package org.example.exercises.javase011.exercise2;

public class Intern extends Employee{
    private String university;

    public Intern(String name,String id,double salary,String university){
        super(id, name, salary);
        setUniversity(university);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        if(university.matches("[A-Za-z ]+")){
            this.university = university;
        }else {
            throw new IllegalArgumentException("University is of the wrong format");
        }
    }

    @Override
    public double calculateBonus(double salary) {
        return salary+500;
    }
}

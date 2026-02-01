package org.example.exercises.javase011.exercise2;

public class Manager extends Employee{
    private String department;

    public Manager(String id,String name,double salary,String department){
        super(id, name, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department.matches("[A-Za-z ]+")){
            this.department = department;
        }
        else throw new IllegalArgumentException("Department can only contain letters");
    }

    @Override
    public double calculateBonus(double salary) {
        return 15/100*salary;
    }
}

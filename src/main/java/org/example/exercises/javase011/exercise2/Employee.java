package org.example.exercises.javase011.exercise2;

public abstract class Employee {
    private final String id;
    private String name;
    private double salary;

    public Employee(String id,String name,double salary){
        if(id==null || !id.matches("\\d{13}")){
            throw new IllegalArgumentException("ID cant be null and should be numeric");
        }
        this.id=id;
        setName(name);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name.matches("[A-Za-z ]+")){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Name cant be made of numbers or symbols.");
        }
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new IllegalArgumentException("Salary can't be less than or equals to zero.");
        }
        this.salary = salary;
    }

    public abstract double calculateBonus(double salary);

    public void displayInfo(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
    }
}

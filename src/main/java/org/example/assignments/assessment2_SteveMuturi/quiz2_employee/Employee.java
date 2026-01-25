package org.example.assignments.assessment2_SteveMuturi.quiz2_employee;

public class Employee {
    private String name;
    private  Long id;
    private double salary;

    public Employee(String name,Long id,double salary){
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()){
            System.out.println("Name cannot be blank");
        }
        this.name = name;
    }

    public void setId(Long id) {
        if (id==0 || id==null){
            System.out.println("ID cannot be zero");
        }
        this.id = id;
    }

    public void setSalary(double salary) {
        if(salary==0){
            System.out.println("Salary must be specified");
        }
        this.salary = salary;
    }

    public double calculateBonus(double salary){
        return 5/100*salary;
    }

    public void displayInfo(){
        System.out.println("Employee name is: "+getName());
        System.out.println("Employee Id is: "+getId());
        System.out.println("Employee salary is: "+getSalary());
    }
}


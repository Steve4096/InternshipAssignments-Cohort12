package org.example.exercises.javase009.exercise3;

public class Professor extends UniversityPerson{
    private String department;
    private double salary;

    public Professor(String id,String name,String email,String department,double salary){
        super(id,name,email);
        setDepartment(department);
        setSalary(salary);
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    public void setDepartment(String department) {
        if(department==null || !department.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Department should only contain letters");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new IllegalArgumentException("Salary can't be 0");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"{department:'"+department+"',salary:'"+salary+"'}";
    }
}

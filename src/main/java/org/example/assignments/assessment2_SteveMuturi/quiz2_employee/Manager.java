package org.example.assignments.assessment2_SteveMuturi.quiz2_employee;

public class Manager extends Employee{
    private String department;

    public Manager(String name,Long id,double salary,String department){
        super(name,id,salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department==null || department.trim().isEmpty()){
            System.out.println("Department name cannot be empty");
        }
        this.department = department;
    }

    @Override
    public double calculateBonus(double salary) {
        if(getDepartment()==null){
            super.calculateBonus(salary);
        }
        return 15/100*salary;
    }
}

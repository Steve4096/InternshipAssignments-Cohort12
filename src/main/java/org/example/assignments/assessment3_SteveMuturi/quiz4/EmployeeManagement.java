package org.example.assignments.assessment3_SteveMuturi.quiz4;

public class EmployeeManagement {
    private static String companyName;
    private String employeeName;
    private double salary;

    public EmployeeManagement(String companyName,String employeeName,double salary){
        setCompanyName(companyName);
        setEmployeeName(employeeName);
        setSalary(salary);
    }

    public static void setCompanyName(String companyName){
        if(companyName==null || companyName.isEmpty() || !companyName.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Company name should be in letter format");
        }
        EmployeeManagement.companyName=companyName;
    }

    public void setEmployeeName(String employeeName){
        if(employeeName==null || employeeName.isEmpty() || !employeeName.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Employee name should be in letter format");
        }
        this.employeeName=employeeName;
    }

    private void setSalary(double salary){
        if(salary<0){
            throw new IllegalArgumentException("Salary can't be negative");
        }
        this.salary=salary;
    }

    public double calculateBonus(){
        return 0.1*salary;
    }

    public String getEmployeeDetails(){
        return "Employee name: "+employeeName+" Salary: "+salary+" Company name: "+companyName+" Bonus: "+calculateBonus();
    }
}


//Issues in the earlier code
/*
1.The company name was public hence could be modified by anyone thus not following encapsulation practices
2.Constructor only sets 1 field,the others remain uninitialized
3.Employee name is not validated thus all characters are accepted even numbers and special characters
4.No proper exception handling since errors are only printed instead of being captured thus the system continues with improper data
5.Salary is assigned to itself
6.calculateBonus method had a void return type yet it was returning the bonus calculation
 */
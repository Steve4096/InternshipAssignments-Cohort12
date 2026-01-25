package org.example.assignments.assessment2_SteveMuturi.quiz5_conceptualquestions;

import org.example.assignments.assessment2_SteveMuturi.quiz2_employee.Employee;

public class ConceptualQuestions {
    //Question 1
    /*Method overloading is the process of implementing one method in different ways for example
    by changing the parameter data types, the number of parameters or the return type of a method all this
    without changing the method name whereas method overriding is the changing of how a method operates for example
    how it processes data. Method overriding is only achieved through inheritance and only the child classes can override methods*/

    //Question 2
    /*Fields are declared using the private keyword so as to prevent external modifications without passing
    through the required ways.*/

    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    //Question 3
    //The super keyword is used in the child class to reference the parent's class constructor or methods.

    public class Employee {
        private String name;
        private  Long id;
        private double salary;

        public Employee(String name,Long id,double salary){
            this.name=name;
            this.id=id;
            this.salary=salary;
        }}

    public class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name,Long id,double salary,String programmingLanguage){
            super(name,id,salary);
            this.programmingLanguage=programmingLanguage;
        }}

    //Question 4
    /*The @Override annotation is used in child classes to provide different implementations to the methods set in
            the parent class but in the child class.*/

    /*public double calculateBonus(double salary){
        return 5/100*salary;
    }

    @Override
    public double calculateBonus(double salary) {
        if(getProgrammingLanguage()==null){
            super.calculateBonus(salary);
        }
        return 10/100*salary;
    }*/

    //Question 5

}

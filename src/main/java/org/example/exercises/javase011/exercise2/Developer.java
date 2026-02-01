package org.example.exercises.javase011.exercise2;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name,String id,double salary,String programmingLanguage){
        super(name,id,salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage(){return programmingLanguage;}

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage.equals(null) || programmingLanguage.trim().isEmpty()){
            System.out.println("Programming language must be specified.");
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus(double salary) {
//        if(getProgrammingLanguage()==null){
//            super.calculateBonus(salary);
//        }
        return 10/100*salary;
    }
}

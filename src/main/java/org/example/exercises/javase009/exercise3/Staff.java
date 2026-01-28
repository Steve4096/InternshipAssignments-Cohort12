package org.example.exercises.javase009.exercise3;

public class Staff extends UniversityPerson{
    private String position;
    private int workHours;

    public Staff(String id,String name,String email,String position,int workHours){
        super(id, name, email);
        setPosition(position);
        setWorkHours(workHours);
    }

    public String getPosition(){
        return position;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setPosition(String position) {
        if(!position.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Position should not contain digits");
        }
        this.position = position;
    }

    public void setWorkHours(int workHours) {
        if(workHours<0){
            throw new IllegalArgumentException("Work hours can't be less than 0");
        }
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return super.toString()+"{position:'"+position+"',workhours:'"+workHours+"'}";
    }
}

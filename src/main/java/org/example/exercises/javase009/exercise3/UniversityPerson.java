package org.example.exercises.javase009.exercise3;

public class UniversityPerson {
    private final String id;
    private String name;
    private String email;

    public UniversityPerson(String id,String name,String email){
        if(id==null || id.isEmpty()){
            throw new IllegalArgumentException("ID field can't be empty");
        }
        this.id=id;
        setName(name);
        setEmail(email);
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty() || !name.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Name can't be null and must contain only letters");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if(email==null || !email.contains("@")){
            throw new IllegalArgumentException("Email does not contain @");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "University person{id:'"+id+"',name:'"+name+"',email:'"+email+"'}";
    }
}

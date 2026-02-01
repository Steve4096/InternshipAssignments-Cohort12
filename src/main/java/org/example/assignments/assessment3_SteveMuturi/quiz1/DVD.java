package org.example.assignments.assessment3_SteveMuturi.quiz1;

public class DVD extends LibraryItem {
    private String duration;
    private String rating;

    public DVD(String itemId, String title, String author,String rating,String duration){
        super(itemId, title, author);
        setDuration(duration);
        setRating(rating);
    }

    public void setDuration(String duration) {
        if(!duration.matches("\\d+")){
            throw new IllegalArgumentException("Duration should be in numbers");
        }
        this.duration = duration;
    }

    public void setRating(String rating){
        if(rating==null || !rating.matches("\\d+")){
            throw new IllegalArgumentException("Rating should be in numbers");
        }
        this.rating=rating;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Duration: "+duration);
        System.out.println("Rating: "+rating);
    }
}

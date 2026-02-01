package org.example.assignments.assessment3_SteveMuturi.quiz1;

import java.util.InputMismatchException;
import java.util.concurrent.RejectedExecutionException;

public class Library {
    private final String itemId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Library(String itemId,String title,String author){
        if(!itemId.matches("//d+") || itemId.isEmpty()){
            throw new InputMismatchException("Item ID should be specified.");
        }
        this.itemId=itemId;
        setTitle(title);
        setAuthor(author);
        this.isAvailable=true;
    }

    public void setTitle(String title) {
        if(title==null || !title.matches("[A-Za-z ]+")){
            throw new RuntimeException("Title should be specified.");
        }
        this.title=title;
    }

    public void setAuthor(String author) {
        if(author==null || !author.matches("[A-Za-z ]+")){
            throw new RuntimeException("Author should be specified.");
        }
        this.author=author;
    }

    public void checkOut(){
        if(!isAvailable){
            throw new InvalidOperationException("Book already borrowed.");
        }
        System.out.println("Successfully borrowed");
        isAvailable=false;
    }

    public void returnItem(){
        if(isAvailable){
            throw new InvalidOperationException("Book is available");
        }
        System.out.println("Successfully returned");
        isAvailable=true;
    }

    public void displayDetaills(){
        System.out.println("Item ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Is available: "+isAvailable);
    }
}

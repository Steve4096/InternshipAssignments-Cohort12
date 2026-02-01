package org.example.assignments.assessment3_SteveMuturi.quiz1;

import java.util.InputMismatchException;

public abstract class LibraryItem {
    protected final String itemId;
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String itemId, String title, String author){
        if(itemId==null || itemId.isEmpty()){
            throw new IllegalArgumentException("Item ID should be specified.");
        }
        this.itemId=itemId;
        setTitle(title);
        setAuthor(author);
        this.isAvailable=true;
    }

    public void setTitle(String title) {
        if(title==null || !title.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Title should be specified.");
        }
        this.title=title;
    }

    public void setAuthor(String author) {
        if(author==null || !author.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Author should be specified.");
        }
        this.author=author;
    }

    public void checkOut(){
        if(!isAvailable){
            throw new InvalidOperationException("Item is currently not available.");
        }
        System.out.println("Successfully borrowed");
        isAvailable=false;
    }

    public void returnItem(){
        if(isAvailable){
            throw new InvalidOperationException("Item is available");
        }
        System.out.println("Successfully returned");
        isAvailable=true;
    }

    public abstract void displayDetails();
}

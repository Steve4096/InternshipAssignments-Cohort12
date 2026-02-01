package org.example.assignments.assessment3_SteveMuturi.quiz1;

public class Book extends LibraryItem{
    private String isbn;
    private String genre;

    public Book(String itemId, String title, String author,String isbn,String genre){
        super(itemId, title, author);
        setIsbn(isbn);
        setGenre(genre);
    }

    public void setIsbn(String isbn) {
        if(isbn==null || isbn.isEmpty() || !isbn.matches("\\d+")){
            throw new IllegalArgumentException("ISBN should be in numbers and not blank");
        }
        this.isbn = isbn;
    }

    public void setGenre(String genre) {
        if(genre==null || genre.isEmpty() || !genre.matches("[A-Za-z ]+")){
            throw new IllegalArgumentException("Genre should contain only letters");
        }
        this.genre=genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+isbn);
        System.out.println("Genre: "+genre);
    }
}

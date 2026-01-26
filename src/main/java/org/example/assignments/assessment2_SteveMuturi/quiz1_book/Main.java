package org.example.assignments.assessment2_SteveMuturi.quiz1_book;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("Introduction to Java","Steve Muturi","1234357688343",7000);

        // Print info
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Book available? " + book.isAvailable());
        System.out.println(book.toString());

        // Borrow the book
        book.borrowBook(); // prints nothing if successful, but changes state
        System.out.println("Book available? " + book.isAvailable());

        // Try returning
        book.returnBook();
        System.out.println("Book available? " + book.isAvailable());
    }
}

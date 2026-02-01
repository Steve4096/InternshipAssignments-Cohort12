package org.example.assignments.assessment3_SteveMuturi.quiz1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LibraryItem book=new Book("B001","Introduction to Java programming","Steve Muturi","2344","Educative");
        book.displayDetails();
        LibraryItem magazine=new Magazine("MG001","Vogue","Vogue",34, LocalDate.now());
        magazine.displayDetails();
    }
}

package org.example.assignments.assessment3_SteveMuturi.quiz1;

import org.example.assignments.assessment2_SteveMuturi.assignment2_basicbankaccountsystem.InvalidFormatException;

import java.time.LocalDate;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private LocalDate publicationDate;

    public Magazine(String itemId, String title, String author,int issueNumber,LocalDate publicationDate){
        super(itemId, title, author);
        setIssueNumber(issueNumber);
        this.publicationDate=publicationDate;
    }

    public void setIssueNumber(int issueNumber){
        if(issueNumber<0){
            throw new InvalidFormatException("Issue number can't be less than 0");
        }
        this.issueNumber=issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Issue number: "+issueNumber);
        System.out.println("Publication date: "+publicationDate);
    }
}

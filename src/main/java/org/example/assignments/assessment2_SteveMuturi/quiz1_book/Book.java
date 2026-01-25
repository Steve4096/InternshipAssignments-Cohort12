package org.example.assignments.assessment2_SteveMuturi.quiz1_book;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    public Book(String title,String author,String isbn,double price,boolean isAvailable){
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
        setIsAvailable(isAvailable);
    }

    public String getTitle(){return title;}

    public String getAuthor(){return author;}

    public String getIsbn(){return isbn;}

    public double getPrice(){return price;}

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title){
        if(title!=null){
            setTitle(title);
        }
    }

    public void setAuthor(String author){
        if(author!=null){
            //setAuthor(author);
            this.author=author;
        }
    }

    public void setIsbn(String isbn) {
        if(isbn.length()>13 || isbn.length()<13){
            System.out.println("ISBN should exactly be 13 digits");
        }
        this.isbn = isbn;
    }

    public void setPrice(double price){
        if(price<0){
            System.out.println("Price can't be 0.");
        }
        setPrice(price);
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrowBook(String title){

    }

    public void returnBook(){}

    @Override
    public String toString() {
        return "Book{title:'"+title+"',author:'"+author+"',price:'"+price+"',isAvailable:'"+isAvailable+"'}";
    }
}

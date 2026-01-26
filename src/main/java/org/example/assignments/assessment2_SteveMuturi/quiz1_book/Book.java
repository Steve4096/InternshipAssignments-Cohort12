package org.example.assignments.assessment2_SteveMuturi.quiz1_book;

public class Book {
    private String title;
    private String author;
    private final String isbn;
    private double price;
    private boolean isAvailable;

    public Book(String title,String author,String isbn,double price){
        setTitle(title);
        setAuthor(author);
        if(isbn==null || !isbn.matches("\\d{13}")){
            throw new IllegalArgumentException("ISBN should be exactly 13 characters.");
        }
        this.isbn=isbn;
        setPrice(price);
        this.isAvailable=true;
    }

    public String getTitle(){return title;}

    public String getAuthor(){return author;}

    public String getIsbn(){return isbn;}

    public double getPrice(){return price;}

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title){
        if(title==null || title.isEmpty()){
            System.out.println("Title can't be null or empty");
            return;
        }
        this.title=title;
    }

    public void setAuthor(String author){
        if(author==null || author.isEmpty()){
            System.out.println("Author field can't be empty");
            return;
        }
        this.author=author;
    }

    public void setPrice(double price){
        if(price<0){
            System.out.println("Price can't be 0.");
            return;
        }
        this.price=price;
    }

    public void borrowBook(){
        if (!isAvailable()){
            System.out.println("Book is already borrowed.");
            return;
        }
        isAvailable=false;
    }

    public void returnBook(){
        if(isAvailable){
            System.out.println("Book is currently not borrowed.");
            return;
        }
        isAvailable=true;
    }

    @Override
    public String toString() {
        return "Book{title:'"+title+"',author:'"+author+"',price:'"+price+"',isAvailable:'"+isAvailable+"'}";
    }
}

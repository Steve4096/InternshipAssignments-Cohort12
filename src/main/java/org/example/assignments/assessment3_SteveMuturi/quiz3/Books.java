package org.example.assignments.assessment3_SteveMuturi.quiz3;

public class Books extends Product {
    private String author;
    private String isbn;
    private String publisher;

    public Books(String productId,String name,double price,int stock,String author,String isbn,String publisher){
        super(productId, name, price,stock);
        setIsbn(isbn);
    }

    public void setIsbn(String isbn) {
        if(isbn==null || isbn.isEmpty() || !isbn.matches("\\d+")){
            throw new InvalidFormatException("ISBN should be in numbers and not blank");
        }
        this.isbn = isbn;
    }

    @Override
    public double calculateDiscount() {
        return 0.2*price;
    }

    @Override
    public String getProductType() {
        return "Book";
    }
}

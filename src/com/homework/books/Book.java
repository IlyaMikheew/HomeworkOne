package com.homework.books;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = new Author[authors.length];
        for (int i = 0; i < authors.length; i++){
            this.authors[i] = new Author(authors[i].getName(),
                                         authors[i].getEmail(),
                                         authors[i].getGender());
        }
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAuthorNames(){
        String names = "";
        for(int i = 0; i < authors.length; i++){
            names += authors[i].getName();
            if(i < authors.length-1){
                names += ", ";
            }
        }
        return names;
    }
}


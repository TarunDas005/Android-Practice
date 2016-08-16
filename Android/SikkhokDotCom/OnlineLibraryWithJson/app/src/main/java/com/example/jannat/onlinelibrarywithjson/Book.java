package com.example.jannat.onlinelibrarywithjson;

/**
 * Created by JANNAT on 5/2/2016.
 */
public class Book {
    private String title,author,category,ISBN;
    private double price;
    private int id;


    public Book(String title, String author, String category, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.ISBN = ISBN;
        this.price = price;
    }

    public Book(int id, String title, String author, String category, String ISBN, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.ISBN = ISBN;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

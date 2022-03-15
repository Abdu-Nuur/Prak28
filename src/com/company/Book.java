package com.company;

import java.util.Set;

public class Book <T extends BookType> {
    private Set<FileInfo> images;
    private String bookName;
    private String bookAuthor;
    private int price;
    private int likes;
    private T book;

    public Book(T book, Set<FileInfo> images, String bookName, String bookAuthor, int price) {
        this.book = book;
        this.images = images;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
        this.likes = 0;
    }

    public Book() {

    }

    public Set<FileInfo> getImages() {
        return images;
    }

    public void setImages(Set<FileInfo> images) {
        this.images = images;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        this.book = book;
    }

    public void like() {
        this.likes++;
    }

    public void dislike() {
        this.likes--;
    }
    @Override
    public String toString() {
        return "book : " + bookName;
    }
}

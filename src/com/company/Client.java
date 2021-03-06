package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Client {
    private String clientName;
    private String clientEmail;
    private Set<Book<?>> likedBooks;
    private Set<Book<?>> satypAlyngynganKitepteri;

    public Client(String clientName,
                  String clientEmail) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.likedBooks = new HashSet<>();
        this.satypAlyngynganKitepteri = new HashSet<>();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Set<Book<?>> getLikedBooks() {
        return likedBooks;
    }

    public void setLikedBooks(Set<Book<?>> likedBooks) {
        this.likedBooks = likedBooks;
    }

    public Set<Book<?>> getSatypAlyngynganKitepteri() {
        return satypAlyngynganKitepteri;
    }

    public void setSatypAlyngynganKitepteri(Set<Book<?>> satypAlyngynganKitepteri) {
        this.satypAlyngynganKitepteri = satypAlyngynganKitepteri;
    }

    public void likedABook(Book<?> book) {
        this.likedBooks.add(book);
    }

    public void dislikedBook(Book<?> book) {
        this.likedBooks.remove(book);
    }

    public void buyABook(Book<?> book) {
        this.satypAlyngynganKitepteri.add(book);
    }
    @Override
    public String toString() {
        return "Client " +
                "clientName = " + clientName +
                "  clientEmail = " + clientEmail +
                " likedBooks = " + likedBooks +
                "  satypAlyngynganKitepteri = " + satypAlyngynganKitepteri +
                ' ';
    }

}

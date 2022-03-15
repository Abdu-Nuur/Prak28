package com.company;

import com.company.exceptions.AlreadyLikedException;

public class Application {

    public void like(Client client, Book<?> book) {
        try {
            if (client.getLikedBooks().contains(book)) {
                throw new AlreadyLikedException();
            }
            client.likedABook(book);
            book.like();
        } catch (AlreadyLikedException exception) {
            String message = String.format("client [%s] already liked book [%s]",
                    client.getClientName(),
                    book.getBookName());
            System.err.println(message);
        }
    }

    public void dislike(Client client, Book<?> book) {
        client.dislikedBook(book);
        book.dislike();
    }

    public void buyABook(Client client,
                                Book<?> book) {
        client.buyABook(book);
    }
}

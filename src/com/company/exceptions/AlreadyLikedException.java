package com.company.exceptions;

/**
 * @author Beksultan
 */
public class AlreadyLikedException extends RuntimeException {
    public AlreadyLikedException() {
        super();
    }

    public AlreadyLikedException(String message) {
        super(message);
    }
}

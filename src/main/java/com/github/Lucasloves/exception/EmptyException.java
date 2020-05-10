package com.github.Lucasloves.exception;

/**
 * @author: Cynaith
 **/
public class EmptyException extends RuntimeException{
    public EmptyException() {
    }

    public EmptyException(String message) {
        super(message);
    }
}

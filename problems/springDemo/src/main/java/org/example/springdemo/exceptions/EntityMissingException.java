package org.example.springdemo.exceptions;

public class EntityMissingException extends RuntimeException{
    public EntityMissingException(String msg) {
        super(msg);
    }
}

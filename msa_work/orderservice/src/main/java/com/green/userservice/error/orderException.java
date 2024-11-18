package com.green.userservice.error;

public class orderException extends RuntimeException {
    public orderException(String message) {
        super(message);
    }
}

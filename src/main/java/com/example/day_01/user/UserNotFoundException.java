package com.example.day_01.user;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}

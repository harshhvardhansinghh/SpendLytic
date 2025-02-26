package com.expenseTracker.spendlytic.exceptions;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(String message) {
        super(message);
    }
}

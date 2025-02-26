package com.expenseTracker.spendlytic.exceptions;

public class CategoryAlreadyExistsException extends Exception{

    public CategoryAlreadyExistsException(String message) {
        super(message);
    }
}

package com.expenseTracker.spendlytic.exceptions;

public class TransactionTypeNotFoundException extends Exception{

    public TransactionTypeNotFoundException(String message) {
        super(message);
    }
}

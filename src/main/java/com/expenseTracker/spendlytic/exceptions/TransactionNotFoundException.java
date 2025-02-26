package com.expenseTracker.spendlytic.exceptions;

public class TransactionNotFoundException extends Exception{

    public TransactionNotFoundException(String message) {
        super(message);
    }
}

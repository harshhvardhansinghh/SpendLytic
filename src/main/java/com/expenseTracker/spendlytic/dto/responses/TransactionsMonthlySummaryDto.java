package com.expenseTracker.spendlytic.dto.responses;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionsMonthlySummaryDto {

    private int month;

    private double total_expense;

    private double total_income;
}

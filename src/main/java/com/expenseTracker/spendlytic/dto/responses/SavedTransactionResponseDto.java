package com.expenseTracker.spendlytic.dto.responses;

import com.expenseTracker.spendlytic.enums.ETransactionFrequency;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SavedTransactionResponseDto {
    private long planId;

    private int transactionType;

    private String categoryName;

    private double amount;

    private String description;

    @Enumerated(EnumType.STRING)
    private ETransactionFrequency frequency;

    private String dueInformation;
}

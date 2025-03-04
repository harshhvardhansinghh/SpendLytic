package com.expenseTracker.spendlytic.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PageResponseDto<T> {

    T data;

    int totalNoOfPages;

    Long totalNoOfRecords;

}

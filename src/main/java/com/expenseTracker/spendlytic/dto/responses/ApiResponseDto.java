package com.expenseTracker.spendlytic.dto.responses;
import com.expenseTracker.spendlytic.enums.ApiResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ApiResponseDto<T> {
    private ApiResponseStatus status;

    private HttpStatus httpStatus;

    private T response;

}

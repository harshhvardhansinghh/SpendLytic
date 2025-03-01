package com.expenseTracker.spendlytic.services;

import com.expenseTracker.spendlytic.dto.requests.ResetPasswordRequestDto;
import com.expenseTracker.spendlytic.dto.requests.SignUpRequestDto;
import com.expenseTracker.spendlytic.dto.responses.ApiResponseDto;
import com.expenseTracker.spendlytic.exceptions.UserAlreadyExistsException;
import com.expenseTracker.spendlytic.exceptions.UserNotFoundException;
import com.expenseTracker.spendlytic.exceptions.UserServiceLogicException;
import com.expenseTracker.spendlytic.exceptions.UserVerificationFailedException;
import jakarta.mail.MessagingException;
import org.springframework.http.ResponseEntity;

import java.io.UnsupportedEncodingException;

public interface AuthService {

    ResponseEntity<ApiResponseDto<?>> save(SignUpRequestDto signUpRequestDto) throws MessagingException, UnsupportedEncodingException, UserAlreadyExistsException, UserServiceLogicException;
    ResponseEntity<ApiResponseDto<?>> resendVerificationCode(String email) throws MessagingException, UnsupportedEncodingException, UserNotFoundException, UserServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> verifyEmailAndSendForgotPasswordVerificationEmail(String email) throws UserServiceLogicException, UserNotFoundException;

    ResponseEntity<ApiResponseDto<?>> verifyForgotPasswordVerification(String code) throws UserVerificationFailedException, UserServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> verifyRegistrationVerification(String code) throws UserVerificationFailedException;

    ResponseEntity<ApiResponseDto<?>> resetPassword(ResetPasswordRequestDto resetPasswordDto) throws UserNotFoundException, UserServiceLogicException;
}

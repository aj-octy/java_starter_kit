package com.alphamoney.repayment.util;

import com.alphamoney.repayment.dto.ApiResponse;
import org.springframework.http.ResponseEntity;

public class ApiResponseUtil {

    public static <T> ResponseEntity<ApiResponse<T>> success(String message, T data) {
        ApiResponse<T> response = new ApiResponse<>(200, message, data);
        return ResponseEntity.ok(response);
    }

    public static <T> ResponseEntity<ApiResponse<T>> created(String message, T data) {
        ApiResponse<T> response = new ApiResponse<>(201, message, data);
        return ResponseEntity.status(201).body(response);
    }

    public static <T> ResponseEntity<ApiResponse<T>> error(int statusCode, String message, T data) {
        ApiResponse<T> response = new ApiResponse<>(statusCode, message, data);
        return ResponseEntity.status(statusCode).body(response);
    }
}

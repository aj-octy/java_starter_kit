package com.alphamoney.repayment.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}

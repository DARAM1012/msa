package com.pmh.ex08.error;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    // ctrl + shift + x 번역단축기
    DUPLICATE_USERS(HttpStatus.BAD_REQUEST , "EMAIL 중복입니다."),
    ;

    private HttpStatus httpStatus;
    private String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}

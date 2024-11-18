package com.green.userservice.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorControllerAdvice {

    @ExceptionHandler(orderException.class)
    public ResponseEntity<String> userException(orderException userException) {
        return ResponseEntity.badRequest().body(userException.getMessage());
    }
}

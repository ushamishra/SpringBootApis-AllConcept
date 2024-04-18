package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<MyErrorResponse> handleResourceNotFound(ResourceNotFoundException ex) {

        Problems problems = new Problems();
        problems.setDetail("Employee not found");
        problems.setStatus(400);
        MyErrorResponse errorResponse = new MyErrorResponse() ;
        errorResponse.setBody(problems);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}

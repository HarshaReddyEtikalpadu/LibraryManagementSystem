package com.miniproject.LibraryManagementSystem.exceptions;


import com.miniproject.LibraryManagementSystem.controller.StudentController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<String> globalExceptions
            (Exception ex) {
        return ResponseEntity.internalServerError().body(ex.getMessage());
    }

}
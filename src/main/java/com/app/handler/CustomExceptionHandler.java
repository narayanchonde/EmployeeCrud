package com.app.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.payload.response.ErrorMessage;
import com.app.rest.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorMessage>  handleEmployeeNotFoundException(EmployeeNotFoundException enfe){
		
		return ResponseEntity.internalServerError().body(
				new ErrorMessage(new Date().toString(), enfe.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), null));
		
	}
}

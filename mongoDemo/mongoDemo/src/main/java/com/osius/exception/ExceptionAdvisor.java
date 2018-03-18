package com.osius.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionAdvisor {

	@ExceptionHandler(RestServiceException.class)
	@ResponseBody
	public ResponseEntity<ErrorResponse> handleException(RestServiceException e){
		ErrorResponse response = new ErrorResponse(e.getErrorCode(), e.getErrorMessage());
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.valueOf(e.getHttpStatus()));
	}
}

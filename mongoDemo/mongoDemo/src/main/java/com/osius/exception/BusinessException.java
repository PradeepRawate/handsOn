package com.osius.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 6350548090521782880L;
	
	private String errorCode;
	private String errorMessage;
	private Throwable throwable;
	
	public BusinessException(String errorCode, String errorMessage, Throwable throwable) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.throwable = throwable;
	}

	public BusinessException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

}

package com.facebook.whatsapp;

public class InvalidMessageException extends Exception {

	public InvalidMessageException() {
	}

	public InvalidMessageException(String message) {
		super(message);
	}

	public InvalidMessageException(Throwable cause) {
		super(cause);
	}

	public InvalidMessageException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidMessageException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

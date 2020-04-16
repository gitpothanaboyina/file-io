package org.tech4all.ioplatform.exception;

public class IOException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IOException() {}

	public IOException(String message) { super(message);	}

	public IOException(Throwable cause) { super(cause); }

	public IOException(String message, Throwable cause) { super(message, cause); }

	public IOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
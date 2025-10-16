package com.bytehonor.sdk.framework.core.exception;

public class ParameterException extends RuntimeException {

    private static final long serialVersionUID = 4969647817957788386L;

    public ParameterException() {
        super();
    }

    public ParameterException(String message) {
        super(message);
    }

    public ParameterException(String message, Throwable cause) {
        super(message, cause);
    }
}

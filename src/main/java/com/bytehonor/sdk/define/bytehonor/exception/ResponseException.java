package com.bytehonor.sdk.define.bytehonor.exception;

public class ResponseException extends RuntimeException {

    private static final long serialVersionUID = -7270989851938983992L;

    public ResponseException() {
        super();
    }

    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(String message, Throwable cause) {
        super(message, cause);
    }

}

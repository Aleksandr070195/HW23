package com.example.hw23;

public class NullItenException extends RuntimeException {
    public NullItenException() {
    }

    public NullItenException(String message) {
        super(message);
    }

    public NullItenException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullItenException(Throwable cause) {
        super(cause);
    }

    public NullItenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

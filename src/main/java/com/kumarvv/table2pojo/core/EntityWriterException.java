package com.kumarvv.table2pojo.core;

public class EntityWriterException extends Exception {
    public EntityWriterException() {
        super();
    }

    public EntityWriterException(String message) {
        super(message);
    }

    public EntityWriterException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntityWriterException(Throwable cause) {
        super(cause);
    }

    protected EntityWriterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

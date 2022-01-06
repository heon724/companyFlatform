package com.platform.companyPlatform.exception;

public class CompanyRuntimeException extends RuntimeException {

    public CompanyRuntimeException(String message) {
        super(message);
    }

    public CompanyRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }


    public CompanyRuntimeException(Throwable cause) {
        super(cause);
    }


    protected CompanyRuntimeException(String message, Throwable cause,
                                      boolean enableSuppression,
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

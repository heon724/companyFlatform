package com.platform.companyPlatform.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CompanyException extends CompanyRuntimeException{
    String msgKey;
    HttpStatus status;
    String[] args;


    public CompanyException(String msgKey) {
        super(msgKey);
        this.msgKey= msgKey;
    }

    public CompanyException(String msgKey, String[] args) {
        super(msgKey);
        this.msgKey = msgKey;
        this.args = args;
    }

    public CompanyException(HttpStatus status, String msgKey) {
        super(msgKey);
        this.msgKey = msgKey;
        this.status = status;
    }

    public CompanyException(HttpStatus status, String msgKey, String[] args) {
        super(msgKey);
        this.msgKey = msgKey;
        this.status = status;
        this.args = args;
    }

    public CompanyException(HttpStatus status, String msgKey, Throwable cause) {
        super(msgKey, cause);
        this.msgKey = msgKey;
        this.status = status;
    }


    public CompanyException(HttpStatus status, String msgKey, String[] args, Throwable cause) {
        super(msgKey, cause);
        this.msgKey = msgKey;
        this.status = status;
        this.args = args;
    }
}

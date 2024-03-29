package com.platform.companyPlatform.exception;

import com.platform.companyPlatform.component.ErrorCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CompanyException extends CompanyRuntimeException{
    String msgKey;
    HttpStatus status;
    ErrorCode errorCode;

    public CompanyException(HttpStatus status, String msgKey, ErrorCode errorCode) {
        super(msgKey);
        this.msgKey = msgKey;
        this.status = status;
        this.errorCode = errorCode;
    }
}

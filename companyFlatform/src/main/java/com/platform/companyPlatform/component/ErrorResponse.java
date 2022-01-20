package com.platform.companyPlatform.component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
    private int status;
    private String errorCode;
    private String message;

    public ErrorResponse(ErrorCode errorCode){
        this.status = errorCode.getStatus();
        this.errorCode = errorCode.getErrorCode();
        this.message = errorCode.getMessage();
    }

    public ErrorResponse(String message, ErrorCode errorCode){
        this.message = message;
        this.status = errorCode.getStatus();
        this.errorCode = errorCode.getErrorCode();


    }

}



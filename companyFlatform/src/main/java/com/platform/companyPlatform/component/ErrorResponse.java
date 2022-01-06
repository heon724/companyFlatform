package com.platform.companyPlatform.component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
    private int status;
    private String code;
    private String message;

    public ErrorResponse(ErrorCode errorCode){
        this.status = errorCode.getStatus();
        this.message = errorCode.getMessage();
        this.code = errorCode.getErrorCode();
    }
}



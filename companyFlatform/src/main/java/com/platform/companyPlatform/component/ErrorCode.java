package com.platform.companyPlatform.component;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    NOT_FOUND(404,"COMMON-ERR-404","NOT FOUND"),
    INTER_SERVER_ERROR(500,"COMMON-ERR-500","INTER SERVER ERROR"),
    BAD_REQUEST(400,"MEMBER-ERR-400","BAD REQUEST"),
    ;

    private int status;
    private String errorCode;
    private String message;

}

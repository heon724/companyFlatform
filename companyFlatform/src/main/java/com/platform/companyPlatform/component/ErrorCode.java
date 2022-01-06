package com.platform.companyPlatform.component;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    NOT_FOUND(404,"COMMON-ERR-404","PAGE NOT FOUND"),
    INTER_SERVER_ERROR(500,"COMMON-ERR-500","INTER SERVER ERROR"),
    ID_DUPLICATION(400,"MEMBER-ERR-400","error.company.notfound.company.valid.E0001"),
    ;

    private int status;
    private String errorCode;
    private String message;

}

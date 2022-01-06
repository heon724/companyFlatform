package com.platform.companyPlatform.config;

import com.platform.companyPlatform.exception.CompanyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /* TODO
    * 1. RestControllerAdvice (뭐고, 왜쓰고, 이거 이외에 exception handle 하는 다른 방법들 찾아보기)
    * 2. RestControllerAdvice 에서 우리가 정의한 CompanyException을 어떻게 쓰는지
    * 3. 부가적으로 ResponseEntity타입이 뭔지 왜 이걸 반환하는지
    *
    * enum으로 할지, 이너 클래스로 그냥 만들지
    * */

    @ExceptionHandler(CompanyException.class)
    public ResponseEntity<CompanyException> handleDuplicateException(CompanyException e) {
        log.debug("handleCompanyDuplicateException");
        CompanyException response = new CompanyException(e.getMessage(),e.getErrorCode());
        return new ResponseEntity<>(response, e.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CompanyException> handleException(Exception e) {
        log.error("handleCompanyException", e);
        CompanyException response = new CompanyException(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

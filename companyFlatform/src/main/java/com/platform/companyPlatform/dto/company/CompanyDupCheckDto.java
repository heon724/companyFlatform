package com.platform.companyPlatform.dto.company;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
@ApiModel("중복체크")
public class CompanyDupCheckDto {

    private HttpStatus httpStatus;
    private String msg;
    private String dupCheck;
}

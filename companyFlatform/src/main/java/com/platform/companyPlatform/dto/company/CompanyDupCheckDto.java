package com.platform.companyPlatform.dto.company;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Data
@Builder
@ApiModel("회사 중복체크")
public class CompanyDupCheckDto {

    private String dupCheck;
    private HttpStatus httpStatus;
    private String msg;
}

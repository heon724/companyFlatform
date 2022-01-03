package com.platform.companyPlatform.dto.company;

import io.swagger.annotations.ApiModel;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@ApiModel("회사 등록하기")
public class CompanyRegisterDto {
    private String companyId;
    private String info;
    private String location;
    private String phone;
    private String email;
    private LocalDate foundDate;
}

package com.platform.companyPlatform.dto.company;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("회사 등록하기")
public class CompanyDto {
    private String companyId;
    private String info;
    private String location;
    private String phone;
    private String email;
    private String foundDate;

}

package com.platform.companyPlatform.dto.company;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel("중복체크")
public class CompanyDupCheckDto {

    private String dupCheck;
}
